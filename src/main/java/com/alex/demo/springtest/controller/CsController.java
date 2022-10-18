package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.service.Cs1Service;
import com.alex.demo.springtest.service.CsService;
import com.alex.demo.springtest.vo.CsVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/cs")
public class CsController{

    @Autowired
    private Cs1Service cs1Service;

    @GetMapping("/find")
/*    public R pageXml(@PathVariable("corund") Integer corund,@PathVariable("limit")Integer limit){
        Page<CsVo> page = new Page<>(corund,limit);
        IPage<CsVo> CsPage = csService.findPage(page,new QueryWrapper<>());
        return R.ok().data("Cspage",CsPage);
    }*/
    public List<Cs> find(){
        return cs1Service.getAll();
    }
}
