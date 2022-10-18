package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

/*    Student findByStudentId(int studentId);*/

    @Select("select * from student where student_id=#{studentId}")
    List<Student> selectByStudentId(Integer studentId);
}
