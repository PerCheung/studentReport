package edu.studentreport.dao;

import edu.studentreport.entity.Dorm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 宿舍(Dorm)表数据库访问层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public interface DormDao {

    /**
     * 查询所有
     */
    List<Dorm> queryAll();
    /**
     * 通过ID查询单条数据
     *
     * @param dormId 主键
     * @return 实例对象
     */
    Dorm queryById(String dormId);

    /**
     * 统计总行数
     *
     * @param dorm 查询条件
     * @return 总行数
     */
    long count(Dorm dorm);

    /**
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 影响行数
     */
    int insert(Dorm dorm);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dorm> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Dorm> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Dorm> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Dorm> entities);

    /**
     * 修改数据
     *
     * @param dorm 实例对象
     * @return 影响行数
     */
    int update(Dorm dorm);

    /**
     * 通过主键删除数据
     *
     * @param dormId 主键
     * @return 影响行数
     */
    int deleteById(String dormId);

}

