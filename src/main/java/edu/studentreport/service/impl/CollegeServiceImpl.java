package edu.studentreport.service.impl;

import edu.studentreport.dao.CollegeDao;
import edu.studentreport.entity.College;
import edu.studentreport.service.CollegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 学院(College)表服务实现类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
@Service("collegeService")
public class CollegeServiceImpl implements CollegeService {
    @Resource
    private CollegeDao collegeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param collegeId 主键
     * @return 实例对象
     */
    @Override
    public College queryById(Integer collegeId) {
        return this.collegeDao.queryById(collegeId);
    }

    /**
     * 新增数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    @Override
    public College insert(College college) {
        this.collegeDao.insert(college);
        return college;
    }

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    @Override
    public College update(College college) {
        this.collegeDao.update(college);
        return this.queryById(college.getCollegeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param collegeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer collegeId) {
        return this.collegeDao.deleteById(collegeId) > 0;
    }
}
