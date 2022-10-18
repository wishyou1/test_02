package com.alex.demo.springtest.service;

import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.vo.CsVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CsService extends IService<Cs> {
    IPage<CsVo> findPage(Page<CsVo> page, QueryWrapper<CsVo> queryWrapper);
}
