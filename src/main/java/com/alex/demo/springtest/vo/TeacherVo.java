package com.alex.demo.springtest.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "teacher对象",description = "班级信息")
public class TeacherVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int teacherId;

    @ApiModelProperty(value = "教师名")
    private String teacherName;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
