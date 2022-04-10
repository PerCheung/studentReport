package edu.studentreport.vo;

import java.io.Serializable;

/**
 * @author Peter Cheung
 * @date 2022/4/10 16:36
 */
public class CollegeAndClassVO implements Serializable {
    private static final long serialVersionUID = 816312345280489990L;

    /**
     * 学院名称
     */
    private String collegeName;
    /**
     * 院长姓名
     */
    private String collegeTeacher;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 辅导员姓名
     */
    private String classTeacher;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeTeacher() {
        return collegeTeacher;
    }

    public void setCollegeTeacher(String collegeTeacher) {
        this.collegeTeacher = collegeTeacher;
    }

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
}
