package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Select;


import java.util.List;


public interface CsMapper extends BaseMapper<Cs> {

/*    Cs fingByClassAllId(int csId);*/
    List<Cs> getAll();

}

/*
public interface ClassAllMapper extends BaseMapper<Ct>{

    Ct findByClassId(int classId);
}
*/
