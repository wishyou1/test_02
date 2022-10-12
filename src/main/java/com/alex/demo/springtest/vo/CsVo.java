package com.alex.demo.springtest.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "班级中学生",description = "班级中学生id")
public class CsVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int classId;

    @ApiModelProperty(value = "学生id")
    private int studentId;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
