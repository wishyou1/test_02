/*
package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Student;
import com.alex.demo.springtest.mapper.StudentMapper;
import com.alex.demo.springtest.vo.StudentVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends ServiceImpl<StudentMapper, Student> {

    public StudentVo findStudent(int studentId){
        Student student = this.findByStudentId(studentId);
        if(student.getStudentId() == studentId){
            StudentVo studentVo = new StudentVo();
            BeanUtils.copyProperties(student,studentVo);
            return studentVo;
        }
        return null;
    }

    public Student findByStudentId(int studentId) {

        return baseMapper.findByStudentId(studentId);
    }
}
*/
