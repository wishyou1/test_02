package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Class1;
import com.alex.demo.springtest.entity.Cs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;


/*public interface Class1Mapper extends BaseMapper<Class1> {

    Class1 findByClassId(int classId);
}*/
public interface  Class1Mapper extends BaseMapper<Class1>{
    Cs findStudentById(Serializable id);
}