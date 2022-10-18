package com.alex.demo.springtest.service;

import com.alex.demo.springtest.entity.Cs;
import com.alex.demo.springtest.mapper.CsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Cs1Service {

    @Resource
    private CsMapper csMapper;
    public List<Cs> getAll(){
        return csMapper.getAll();
    }
}
