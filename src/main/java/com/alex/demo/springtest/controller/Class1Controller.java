package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.service.Class1Service;
import com.alex.demo.springtest.vo.Class1Vo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
@RestController
@RequestMapping("/class")
@Api(value = "班级相关", tags = "班级相关")
public class Class1Controller {

    @Autowired
    private Class1Service class1Service;
    private Logger logger = LoggerFactory.getLogger(Class1Controller.class);

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ApiOperation(value = "班级信息查询", notes = "班级查询,传入参数：classid")
    public Class1Vo getClass(int classid){

        Class1Vo class1Vo = class1Service.find1(classid);
        if(null != class1Vo){
            logger.debug("成功");
        }else{
            logger.debug("失败");
        }
        return class1Vo;
    }
/*    public String findStudent(@PathVariable("classid") int id){
        return JSON.toJSONString(class1Service.findStudentByid(id));
    }*/
}
