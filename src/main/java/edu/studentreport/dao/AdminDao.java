package edu.studentreport.dao;

import edu.studentreport.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 管理员(Admin)表数据库访问层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:28
 */
public interface AdminDao {

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
     * 统计总行数
     *
     * @param admin 查询条件
     * @return 总行数
     */
    long count(Admin admin);

    /**
     * 新增数据
     *
     * @param admin 实例对象
     * @return 影响行数
     */
    int insert(Admin admin);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Admin> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Admin> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Admin> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Admin> entities);

    /**
     * 修改数据
     *
     * @param admin 实例对象
     * @return 影响行数
     */
    int update(Admin admin);

    /**
     * 通过用户名修改数据
     *
     * @param admin 实例对象
     * @return 影响行数
     */
    int updateByUser(Admin admin);

    /**
     * 通过主键删除数据
     *
     * @param adminId 主键
     * @return 影响行数
     */
    int deleteById(Integer adminId);

}

