package edu.studentreport.service;

import edu.studentreport.entity.StudentClass;

/**
 * 班级(StudentClass)表服务接口
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:30
 */
public interface StudentClassService {

    /**
     * 通过ID查询单条数据
     *
     * @param className 主键
     * @return 实例对象
     */
    StudentClass queryById(String className);

    /**
     * 新增数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    StudentClass insert(StudentClass studentClass);

    /**
     * 修改数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    StudentClass update(StudentClass studentClass);

    /**
     * 通过主键删除数据
     *
     * @param className 主键
     * @return 是否成功
     */
    boolean deleteById(String className);

}
