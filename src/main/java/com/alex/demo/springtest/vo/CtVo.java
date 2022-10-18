package com.alex.demo.springtest.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "班级中教师",description = "班级中教师id")
public class CtVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int ctId;
    @ApiModelProperty(value = "教室id")
    private int classId;

    @ApiModelProperty(value = "教师id")
    private int teacherId;

    public int getCtId() {
        return ctId;
    }

    public void setCtId(int ctId) {
        this.ctId = ctId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
