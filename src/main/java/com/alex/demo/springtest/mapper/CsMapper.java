package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Cs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;



public interface CsMapper extends BaseMapper<Cs> {

    Cs fingByClassAllId(int classId);
}

/*
public interface ClassAllMapper extends BaseMapper<Ct>{

    Ct findByClassId(int classId);
}
*/
