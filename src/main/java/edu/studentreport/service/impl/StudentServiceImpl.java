package edu.studentreport.service.impl;

import edu.studentreport.dao.StudentDao;
import edu.studentreport.entity.Student;
import edu.studentreport.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生(Student)表服务实现类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 查询所有
     */
    @Override
    public List<Student> queryAll() {
        return this.studentDao.queryAll();
    }

    /**
     * 查询所有已缴费学生
     */
    @Override
    public List<Student> queryAllisPay() {
        return this.studentDao.queryAllisPay();
    }

    /**
     * 登录
     */
    @Override
    public int loginStudent(Student student) {
        Student mysqlStudent = this.studentDao.queryById(student.getStudentId());
        if (mysqlStudent == null) {
            return 0;
        }
        if (mysqlStudent.getStudentPassword().equals(student.getStudentPassword())) {
            return 1;
        }
        return 2;
    }

    /**
     * 通过班级名查找最大学号
     */
    @Override
    public long queryMaxByClassName(String className) {
        return this.studentDao.queryMaxByClassName(className);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param studentId 主键
     * @return 实例对象
     */
    @Override
    public Student queryById(Integer studentId) {
        return this.studentDao.queryById(studentId);
    }


    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student insert(Student student) {
        this.studentDao.insert(student);
        return student;
    }

    /**
     * 修改数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public Student update(Student student) {
        this.studentDao.update(student);
        return this.queryById(student.getStudentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param studentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer studentId) {
        return this.studentDao.deleteById(studentId) > 0;
    }
}
