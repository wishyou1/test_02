package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.service.Class1Service;
import com.alex.demo.springtest.vo.Class1Vo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
@Api(value = "班级相关", tags = "班级相关")
public class Class1Controller {

    @Autowired
    private Class1Service class1Service;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ApiOperation(value = "班级信息查询", notes = "班级查询,传入参数：classid")
    public Class1Vo getClass(int classid){

        Class1Vo class1Vo = class1Service.find1(classid);
        if(null != class1Vo){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
        return class1Vo;
    }
}
