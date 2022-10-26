package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Ct;
import com.alex.demo.springtest.mapper.CtMapper;
import com.alex.demo.springtest.mapper.TeacherMapper;
import com.alex.demo.springtest.vo.CtVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AllTeacherService extends ServiceImpl<CtMapper, Ct> {

    @Resource
    private CtMapper ctMapper;

    @Resource
    private TeacherMapper teacherMapper;

    public CtVo findT(int classId){
        Ct ct = ctMapper.getAllTeacher(classId);
        for (int i = 0; i < classId; i++) {
            List a = (List) teacherMapper.findByTeacherId(ct.getTeacherId());
            if(ct.getClassId() == classId){
                CtVo ctVo = new CtVo();
                BeanUtils.copyProperties(ct,ctVo);
                return ctVo;
            }
        }
        return null;
    }
}
