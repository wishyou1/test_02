package com.alex.demo.springtest.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

@TableName("contect_ct")
@ApiModel(value = "班级老师关联",description = "班级老师关联信息")
public class Ct extends Model<Ct> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id",type = IdType.AUTO)
    private int classId;

    @TableId(value = "teacher_id",type = IdType.AUTO)
    private int teacherId;

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

    @Override
    public String toString() {
        return "Ct{" +
                "classId=" + classId +
                ", teacherId=" + teacherId +
                '}';
    }
}
