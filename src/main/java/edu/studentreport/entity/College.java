package edu.studentreport.entity;

import java.io.Serializable;

/**
 * 学院(College)实体类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public class College implements Serializable {
    private static final long serialVersionUID = 816393354280489990L;
    /**
     * 学院ID
     */
    private Integer collegeId;
    /**
     * 学院名称
     */
    private String collegeName;
    /**
     * 院长姓名
     */
    private String collegeTeacher;


    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

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

}

