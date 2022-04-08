package edu.studentreport.entity;

import java.io.Serializable;

/**
 * 管理员(Admin)实体类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:28
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = 521394848154185105L;
    /**
     * 管理员ID
     */
    private Integer adminId;
    /**
     * 管理员账户名
     */
    private String adminUsername;
    /**
     * 管理员密码
     */
    private String adminPassword;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

}

