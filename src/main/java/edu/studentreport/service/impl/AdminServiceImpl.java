package edu.studentreport.service.impl;

import edu.studentreport.dao.AdminDao;
import edu.studentreport.entity.Admin;
import edu.studentreport.service.AdminService;
import edu.studentreport.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 管理员(Admin)表服务实现类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:28
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

    /**
     * 通过ID查询单条数据
     *
     * @param adminId 主键
     * @return 实例对象
     */
    @Override
    public Admin queryById(Integer adminId) {
        return this.adminDao.queryById(adminId);
    }

    /**
     * 通过用户名查找密码
     */
    @Override
    public String queryByAdminUsername(String adminUsername) {
        return this.adminDao.queryByAdminUsername(adminUsername);
    }

    /**
     * 登录
     */
    @Override
    public int loginAdmin(Admin admin) {
        String password = queryByAdminUsername(admin.getAdminUsername());
        if (password == null) {
            return 0;
        }
        if (password.equals(MD5Util.toMd5(admin.getAdminPassword()))) {
            return 1;
        }
        return 2;
    }

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public Admin insert(Admin admin) {
        admin.setAdminPassword(MD5Util.toMd5(admin.getAdminPassword()));
        this.adminDao.insert(admin);
        return admin;
    }

    /**
     * 修改密码
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    @Override
    public String update(Admin admin) {
        admin.setAdminPassword(MD5Util.toMd5(admin.getNewPassword()));
        this.adminDao.updateByUser(admin);
        return this.queryByAdminUsername(admin.getAdminUsername());
    }

    /**
     * 通过主键删除数据
     *
     * @param adminId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer adminId) {
        return this.adminDao.deleteById(adminId) > 0;
    }
}
