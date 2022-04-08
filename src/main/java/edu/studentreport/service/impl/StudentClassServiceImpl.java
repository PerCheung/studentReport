package edu.studentreport.service.impl;

import edu.studentreport.dao.StudentClassDao;
import edu.studentreport.entity.StudentClass;
import edu.studentreport.service.StudentClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 班级(StudentClass)表服务实现类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:30
 */
@Service("studentClassService")
public class StudentClassServiceImpl implements StudentClassService {
    @Resource
    private StudentClassDao studentClassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param className 主键
     * @return 实例对象
     */
    @Override
    public StudentClass queryById(String className) {
        return this.studentClassDao.queryById(className);
    }

    /**
     * 新增数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    @Override
    public StudentClass insert(StudentClass studentClass) {
        this.studentClassDao.insert(studentClass);
        return studentClass;
    }

    /**
     * 修改数据
     *
     * @param studentClass 实例对象
     * @return 实例对象
     */
    @Override
    public StudentClass update(StudentClass studentClass) {
        this.studentClassDao.update(studentClass);
        return this.queryById(studentClass.getClassName());
    }

    /**
     * 通过主键删除数据
     *
     * @param className 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String className) {
        return this.studentClassDao.deleteById(className) > 0;
    }
}
