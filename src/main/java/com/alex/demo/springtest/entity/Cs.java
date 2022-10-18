package com.alex.demo.springtest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@TableName("contect_cs")
public class Cs extends Model<Cs> {
    private static final long serialVersionUID = 1L;

    @TableId(value = "class_id",type = IdType.AUTO)
    private  int csid;

    @ApiModelProperty(value = "班级id")
    private int classId;

    @ApiModelProperty(value = "学生")
/*    private int studentId;*/
    private List<Student> students;
    public int getId() {
        return csid;
    }

    public void setId(int id) {
        this.csid = id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    /*public int getStudentId() {
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
    }*/

    public int getCsid() {
        return csid;
    }

    public void setCsid(int csid) {
        this.csid = csid;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Cs{" +
                "csid=" + csid +
                ", classId=" + classId +
                ", students=" + students +
                '}';
    }
}
