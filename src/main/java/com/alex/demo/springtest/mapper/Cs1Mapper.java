package com.alex.demo.springtest.mapper;

import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.vo.CsVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Cs1Mapper extends BaseMapper<Cs> {
    IPage<CsVo> findPage(IPage<CsVo> page, @Param(Constants.WRAPPER) QueryWrapper<CsVo> wrapper);
}
