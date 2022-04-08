package edu.studentreport.entity;

import java.io.Serializable;

/**
 * 宿舍(Dorm)实体类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public class Dorm implements Serializable {
    private static final long serialVersionUID = 328867697003454245L;
    /**
     * 宿舍编号
     */
    private String dormId;
    /**
     * 宿舍位置
     */
    private String dormLocation;


    public String getDormId() {
        return dormId;
    }

    public void setDormId(String dormId) {
        this.dormId = dormId;
    }

    public String getDormLocation() {
        return dormLocation;
    }

    public void setDormLocation(String dormLocation) {
        this.dormLocation = dormLocation;
    }

}

