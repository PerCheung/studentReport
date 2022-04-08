package edu.studentreport.entity;

import java.io.Serializable;

/**
 * 学生(Student)实体类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 571839157605656056L;
    /**
     * 学生学号
     */
    private Integer studentId;
    /**
     * 学生密码
     */
    private String studentPassword;
    /**
     * 学生姓名
     */
    private String studentName;
    /**
     * 学生性别
     */
    private Integer studentSex;
    /**
     * 学生电话
     */
    private String studentTel;
    /**
     * 学生邮箱
     */
    private String studentEmail;
    /**
     * 学生身份证号
     */
    private String studentCid;
    /**
     * 学生是否缴费
     */
    private Integer isPay;
    /**
     * 宿舍编号
     */
    private String dormId;
    /**
     * 班级名称
     */
    private String className;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentTel() {
        return studentTel;
    }

    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentCid() {
        return studentCid;
    }

    public void setStudentCid(String studentCid) {
        this.studentCid = studentCid;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getDormId() {
        return dormId;
    }

    public void setDormId(String dormId) {
        this.dormId = dormId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}

