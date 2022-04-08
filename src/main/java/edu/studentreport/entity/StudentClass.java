package edu.studentreport.entity;

import java.io.Serializable;

/**
 * 班级(StudentClass)实体类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:30
 */
public class StudentClass implements Serializable {
    private static final long serialVersionUID = 831157611673223130L;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 辅导员姓名
     */
    private String classTeacher;
    /**
     * 学院ID
     */
    private Integer collegeId;


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

}

