package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.vo.CsVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


public interface CsMapper extends BaseMapper<Cs> {

/*    Cs fingByClassAllId(int csId);*/
    Cs getAll(int classId);

}

/*
public interface ClassAllMapper extends BaseMapper<Ct>{

    Ct findByClassId(int classId);
}
*/
