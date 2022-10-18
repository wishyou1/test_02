package com.alex.demo.springtest.service;


import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.mapper.Cs1Mapper;
import com.alex.demo.springtest.vo.CsVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CsServiceIpml extends ServiceImpl<Cs1Mapper, Cs> implements CsService{
    @Autowired
    private  Cs1Mapper cs1Mapper;

    @Override
    public IPage<CsVo> findPage(Page<CsVo> page, QueryWrapper<CsVo> queryWrapper) {
        return baseMapper.findPage(page,queryWrapper);
    }
}
