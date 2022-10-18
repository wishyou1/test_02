package com.alex.demo.springtest.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "班级中学生",description = "班级中学生id")
public class CsVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int csId;
    @ApiModelProperty(value = "教师id")
    private int classId;

    @ApiModelProperty(value = "学生id")
/*    private int studentId;*/
    private List<StudentVo> studentVos;

    public int getCsId() {
        return csId;
    }

    public void setCsId(int csId) {
        this.csId = csId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

/*    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }*/

    public List<StudentVo> getStudentVos() {
        return studentVos;
    }

    public void setStudentVos(List<StudentVo> studentVos) {
        this.studentVos = studentVos;
    }
}
