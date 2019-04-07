package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StudentMapper;
import com.qf.entity.IClass;
import com.qf.entity.Student;
import com.qf.service.IClassService;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService implements IStudentService {
   @Autowired
   private StudentMapper studentMapper;

    @Reference
    private IClassService classService;

    @Override
    public Map<Student, IClass> getstulist() {
        Map<Student,IClass> map=new HashMap<>();
        List<Student> studentList = studentMapper.selectList(null);
        for (Student s:studentList
             ) {
           map.put(s, classService.getclassbyid(s.getClassId()));
        }
        return map;
    }

    @Override
    public void addstu(Student student) {
        studentMapper.insert(student);
    }
}
