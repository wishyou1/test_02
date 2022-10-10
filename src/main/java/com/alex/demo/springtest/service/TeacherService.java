package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Teacher;
import com.alex.demo.springtest.mapper.StudentMapper;
import com.alex.demo.springtest.mapper.TeacherMapper;
import com.alex.demo.springtest.vo.TeacherVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends ServiceImpl<TeacherMapper, Teacher> {

    public TeacherVo findTeacher(int teacherId){
        Teacher teacher = this.findByTeacherId(teacherId);
        if(teacher.getTeacherId() == teacherId){
            TeacherVo teacherVo = new TeacherVo();
            BeanUtils.copyProperties(teacher,teacherVo);
            return teacherVo;
        }
        return null;
    }

    private Teacher findByTeacherId(int teacherId) {
        return baseMapper.findByTeacherId(teacherId);
    }


}
