package com.alex.demo.springtest.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "Student对象",description = "学生信息")
public class StudentVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int studentId;

    @ApiModelProperty(value = "学生名")
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
