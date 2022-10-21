package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.service.Cs1Service;
import com.alex.demo.springtest.vo.CsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cs")
public class CsController{

    @Autowired
    private Cs1Service cs1Service;

    @RequestMapping (value = "/find",method = RequestMethod.GET)
    public CsVo find(int classid){
        CsVo csVo = cs1Service.getAll(classid);
        /*return cs1Service.getAll(classid);*/
        return csVo;
    }
}
