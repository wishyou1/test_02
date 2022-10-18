/*package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.service.StudentService;
import com.alex.demo.springtest.vo.StudentVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@Api(value = "学生相关",tags = "学生相关")
public class StudentController {

    @Autowired
    private StudentService studentService;
    private Logger logger =LoggerFactory.getLogger(StudentController.class);

    @RequestMapping(value = "/findstudent",method = RequestMethod.GET)
    @ApiOperation(value = "学生信息查询", notes = "学生查询，传入参数:studentId")
    public StudentVo getStudent(int studentid){

        StudentVo studentVo = studentService.findStudent(studentid);
        if(null != studentVo){
            logger.debug("成功");
        }else {
            logger.debug("失败");
        }
        return studentVo;
    }
}*/
