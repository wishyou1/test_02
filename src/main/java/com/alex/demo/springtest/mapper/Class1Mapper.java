package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Class1;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

@Component
public interface Class1Mapper extends BaseMapper<Class1> {
    Class1 findByClassName(String className);
    Class1 findByClassId(int classId);
}
