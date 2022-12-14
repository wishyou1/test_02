package com.alex.demo.springtest.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "Class对象",description = "班级信息")
public class Class1Vo implements Serializable {
    private  static  final long serialVersionUID = 1L;

    private int classId;

    @ApiModelProperty(value = "班级名")
    private String className;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
