package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Class1;
import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.mapper.Class1Mapper;
import com.alex.demo.springtest.vo.Class1Vo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class Class1Service extends ServiceImpl<Class1Mapper,Class1> {

    public Class1Vo find1(int classId){
        Class1 class1 = this.findByClassId(classId);
        if(class1.getClassId() == classId){
            Class1Vo class1Vo = new Class1Vo();
            BeanUtils.copyProperties(class1, class1Vo);
            return class1Vo;
        }
        return null;
    }

   public Class1 findByClassId(int classId){
        return baseMapper.findByClassId(classId);
    }
    }
/*
public class Class1Service extends ServiceImpl<Class1Mapper,Class1> implements Class1ServiceImpl{
    @Override
    public Cs findStudentByid(Serializable id) {
        return getBaseMapper().findStudentById(id);
    }
*/


