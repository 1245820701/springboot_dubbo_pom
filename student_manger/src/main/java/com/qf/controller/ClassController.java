package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.qf.entity.IClass;
import com.qf.entity.Student;
import com.qf.service.IClassService;
import com.qf.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("stu")
public class ClassController {
    @Reference
    private IClassService iClassService;
    @Reference
    private IStudentService studentService;

    @RequestMapping("/")
    public String Index(){
        return "index";
    }

    @RequestMapping("/classlist")
    public  String getClassList(ModelMap map){
        List<IClass> classList = iClassService.getClassList();
        map.put("classList", classList);
        return "class_show";
    }

    @RequestMapping("/toaddclass")
    public String toaddclass(){
        return "addclass";
    }

    @RequestMapping("/addclass")
    public String addClass(IClass iClass,ModelMap map){
        iClassService.addclass(iClass);
        List<IClass> classList = iClassService.getClassList();
        map.put("classList", classList);
        return "class_show";
    }
    @RequestMapping("/stulist")
    public String stulist(ModelMap map){
       Map<Student,IClass> map1= studentService.getstulist();
        map.put("map", map1);
        return "stu_show";
    }

    @RequestMapping("/toaddstudent")
    public String toaddstudent(ModelMap map){
        List<IClass> list = iClassService.getClassList();
        map.put("list", list);
        return "addstudent";

    }

    @RequestMapping("/addstu")
    public String addstu(Student student, ModelMap map){
        studentService.addstu(student);
        Map<Student,IClass> map1= studentService.getstulist();
        map.put("map", map1);
        return "stu_show";

    }

}
