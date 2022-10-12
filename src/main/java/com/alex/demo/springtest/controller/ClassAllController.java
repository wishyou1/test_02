package com.alex.demo.springtest.controller;


import com.alex.demo.springtest.service.ClassAllService;
import com.alex.demo.springtest.service.StudentService;
import com.alex.demo.springtest.vo.CsVo;
import com.alex.demo.springtest.vo.StudentVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*import java.util.logging.Logger;*/

@RestController
@RequestMapping("/classall")
@Api(value = "班级信息相关",tags = "班级信息相关")
public class ClassAllController {

    @Autowired
    private ClassAllService classAllService;
    private StudentService studentService;
    private Logger logger = LoggerFactory.getLogger(ClassAllController.class);

    @RequestMapping(value = "/findclass",method = RequestMethod.GET)
    @ApiOperation(value = "班级所有信息查询",notes = "班级信息查询，传入参数：classid")
    public CsVo getClassAll(int classid){
        CsVo csVo = classAllService.findcs(classid);
        StudentVo studentVo = studentService.findStudent(csVo.getStudentId());
        if(null != csVo){
            logger.debug("成功");
        }else{
            logger.debug("失败");
        }
        return csVo;
    }
}
