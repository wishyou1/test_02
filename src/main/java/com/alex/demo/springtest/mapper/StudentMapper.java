package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface StudentMapper extends BaseMapper<Student> {

    Student findByStudentId(int studentId);
}
