package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Ct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface CtMapper extends BaseMapper<Ct> {

    Ct findByClassId(int classId);
}
