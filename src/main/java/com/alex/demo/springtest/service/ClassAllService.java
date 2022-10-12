package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.mapper.CsMapper;
import com.alex.demo.springtest.vo.CsVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ClassAllService  extends ServiceImpl<CsMapper, Cs> {

    public CsVo findcs(int classId){
        Cs cs = this.findByClassAllId(classId);
        if(cs.getClassId() == classId){
            CsVo csVo = new CsVo();
            BeanUtils.copyProperties(cs,csVo);
            return csVo;
        }
        return null;
    }

    private Cs findByClassAllId(int classId) {
        return baseMapper.fingByClassAllId(classId);
    }

}
