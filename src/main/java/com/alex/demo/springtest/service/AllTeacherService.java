package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Ct;
import com.alex.demo.springtest.mapper.AllTeacherMapper;
import com.alex.demo.springtest.mapper.CtMapper;
import com.alex.demo.springtest.vo.CtVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AllTeacherService extends ServiceImpl<CtMapper, Ct> {

    @Resource
    private AllTeacherMapper allTeacherMapper;

    public CtVo findT(int classId){
        Ct ct = allTeacherMapper.getAllTeacher(classId);
        if(ct.getClassId() == classId){
            CtVo ctVo = new CtVo();
            BeanUtils.copyProperties(ct,ctVo);
            return ctVo;
        }
        return null;
    }

/*    private Ct findByCtId(int ctId) {
        return baseMapper.findByCtId(ctId);
    }*/
}
