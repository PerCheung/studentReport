package edu.studentreport.dao;

import edu.studentreport.entity.College;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学院(College)表数据库访问层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public interface CollegeDao {

    /**
     * 查询所有
     */
    List<College> queryAll();

    /**
     * 通过ID查询单条数据
     *
     * @param collegeId 主键
     * @return 实例对象
     */
    College queryById(Integer collegeId);

    /**
     * 统计总行数
     *
     * @param college 查询条件
     * @return 总行数
     */
    long count(College college);

    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int insert(College college);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<College> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<College> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<College> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<College> entities);

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 影响行数
     */
    int update(College college);

    /**
     * 通过主键删除数据
     *
     * @param collegeId 主键
     * @return 影响行数
     */
    int deleteById(Integer collegeId);

}

