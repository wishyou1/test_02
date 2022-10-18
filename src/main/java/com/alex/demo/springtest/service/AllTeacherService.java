package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Ct;
import com.alex.demo.springtest.mapper.CtMapper;
import com.alex.demo.springtest.vo.CtVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AllTeacherService extends ServiceImpl<CtMapper, Ct> {

    public CtVo findT(int ctId){
        Ct ct = this.findByCtId(ctId);
        if(ct.getCtId() == ctId){
            CtVo ctVo = new CtVo();
            BeanUtils.copyProperties(ct,ctVo);
            return ctVo;
        }
        return null;
    }

    private Ct findByCtId(int ctId) {
        return baseMapper.findByCtId(ctId);
    }
}
