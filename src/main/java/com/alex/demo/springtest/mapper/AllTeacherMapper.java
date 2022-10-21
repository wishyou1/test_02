package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Ct;
import com.alex.demo.springtest.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface AllTeacherMapper extends BaseMapper<Ct> {
    Ct getAllTeacher(int classId);
}
