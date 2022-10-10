package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.service.TeacherService;
import com.alex.demo.springtest.vo.TeacherVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
/*import java.util.logging.Logger;*/

@RestController
@RequestMapping("/teacher")
@Api(value = "教师相关", tags = "教师相关")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    private Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/findteacher",method = RequestMethod.GET)
    @ApiOperation(value = "教师相关查询", notes = "教师查询，传入参数：teacherId")
    public TeacherVo gerTeacher(int teacherid){
        TeacherVo teacherVo = teacherService.findTeacher(teacherid);
        if(null != teacherVo){
            logger.debug("成功");
        }else{
            logger.debug("失败");
        }
        return teacherVo;
    }
}
