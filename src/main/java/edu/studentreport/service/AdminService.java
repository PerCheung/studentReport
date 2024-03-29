package edu.studentreport.service;

import edu.studentreport.entity.Admin;

/**
 * 管理员(Admin)表服务接口
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:28
 */
public interface AdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param adminId 主键
     * @return 实例对象
     */
    Admin queryById(Integer adminId);

    /**
     * 通过用户名查找密码
     */
    String queryByAdminUsername(String adminUsername);

    /**
     * 登录
     */
    int loginAdmin(Admin admin);

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    Admin insert(Admin admin);

    /**
     * 修改密码
     *
     * @param admin 实例对象
     * @return 实例对象
     */
    String update(Admin admin);

    /**
     * 通过主键删除数据
     *
     * @param adminId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer adminId);

}
