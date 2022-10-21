package com.alex.demo.springtest.service;

import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.mapper.CsMapper;
import com.alex.demo.springtest.vo.CsVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service
public class Cs1Service extends ServiceImpl<CsMapper,Cs> {

    @Resource
    private CsMapper csMapper;
    public CsVo getAll(int classId){
        Cs cs = csMapper.getAll(classId);
        if(cs.getClassId() == classId) {
            CsVo csVo = new CsVo();
            BeanUtils.copyProperties(cs,csVo);
            return csVo;
        }
        return null;
    }

}
