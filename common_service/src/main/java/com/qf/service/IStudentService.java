package com.qf.service;

import com.qf.entity.IClass;
import com.qf.entity.Student;

import java.util.Map;

public interface IStudentService {
    Map<Student, IClass> getstulist();

    void addstu(Student student);
}
