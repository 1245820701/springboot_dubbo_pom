package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClassMapper;
import com.qf.entity.IClass;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassServiceServiceImpl implements IClassService {
    @Autowired
    private ClassMapper classMapper;


    @Override
    public List<IClass> getClassList() {
        return classMapper.selectList(null);
    }

    @Override
    public void addclass(IClass iClass) {
        classMapper.insert(iClass);
    }

    @Override
    public IClass getclassbyid(int classId) {
        return classMapper.selectById(classId);
    }
}
