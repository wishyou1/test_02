package com.alex.demo.springtest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;

@TableName("contect_cs")
public class Cs extends Model<Cs> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id",type = IdType.AUTO)
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

    @Override
    public String toString() {
        return "Cs{" +
                "classId=" + classId +
                ", studentId=" + studentId +
                '}';
    }
}
