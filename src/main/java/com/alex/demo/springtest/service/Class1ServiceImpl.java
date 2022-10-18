package com.alex.demo.springtest.service;

import com.alex.demo.springtest.entity.Class1;
import com.alex.demo.springtest.entity.Cs;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

public interface Class1ServiceImpl extends IService<Class1> {
    Cs findStudentByid(Serializable id);
}
