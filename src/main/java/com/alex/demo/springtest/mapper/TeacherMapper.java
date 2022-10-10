package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface TeacherMapper extends BaseMapper<Teacher> {
    Teacher findByTeacherId(int teacherId);
}
