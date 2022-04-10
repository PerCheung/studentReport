package edu.studentreport.service;

import edu.studentreport.entity.Student;

import java.util.List;

/**
 * 学生(Student)表服务接口
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public interface StudentService {

    /**
     * 查询所有
     */
    List<Student> queryAll();

    /**
     * 查询所有已缴费学生
     */
    List<Student> queryAllisPay();

    /**
     * 登录
     */
    int loginStudent(Student student);

    /**
     * 通过班级名查找最大学号
     */
    long queryMaxByClassName(String className);

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    Student queryById(Integer studentId);

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student insert(Student student);

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    Student update(Student student);

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer studentId);

}
