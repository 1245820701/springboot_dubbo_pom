package com.qf.service;

import com.qf.entity.IClass;

import java.util.List;

public interface IClassService {
    List<IClass> getClassList();

    void addclass(IClass iClass);

    IClass getclassbyid(int classId);
}
