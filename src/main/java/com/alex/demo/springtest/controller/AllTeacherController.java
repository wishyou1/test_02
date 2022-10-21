package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.service.AllTeacherService;
import com.alex.demo.springtest.vo.CtVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allteacher")
@Api(value = "所有教师", tags = "所有教师")
public class AllTeacherController {

    @Autowired
    private AllTeacherService allTeacherService;
    private Logger logger = LoggerFactory.getLogger(AllTeacherController.class);

    @RequestMapping(value = "/findt",method = RequestMethod.GET)
    @ApiOperation(value = "教师信息",notes = "教师信息，传入参数：ctid")
    public CtVo getAllTeacher(int classId){
        CtVo ctVo = allTeacherService.findT(classId);
        if(null != ctVo){
            logger.debug("成功");
        }else{
            logger.debug("失败");
        }
        return ctVo;
    }
}
