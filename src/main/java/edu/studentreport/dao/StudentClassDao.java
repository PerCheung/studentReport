package edu.studentreport.dao;

import edu.studentreport.entity.StudentClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 班级(StudentClass)表数据库访问层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:30
 */
public interface StudentClassDao {

    /**
     * 通过ID查询单条数据
     *
     * @param className 主键
     * @return 实例对象
     */
    StudentClass queryById(String className);

    /**
     * 统计总行数
     *
     * @param studentClass 查询条件
     * @return 总行数
     */
    long count(StudentClass studentClass);

    /**
     * 新增数据
     *
     * @param studentClass 实例对象
     * @return 影响行数
     */
    int insert(StudentClass studentClass);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<StudentClass> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<StudentClass> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<StudentClass> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<StudentClass> entities);

    /**
     * 修改数据
     *
     * @param studentClass 实例对象
     * @return 影响行数
     */
    int update(StudentClass studentClass);

    /**
     * 通过主键删除数据
     *
     * @param className 主键
     * @return 影响行数
     */
    int deleteById(String className);

}

