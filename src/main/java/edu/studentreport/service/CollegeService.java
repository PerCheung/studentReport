package edu.studentreport.service;

import edu.studentreport.entity.College;

import java.util.List;

/**
 * 学院(College)表服务接口
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public interface CollegeService {

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
     * 新增数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    College insert(College college);

    /**
     * 修改数据
     *
     * @param college 实例对象
     * @return 实例对象
     */
    College update(College college);

    /**
     * 通过主键删除数据
     *
     * @param collegeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer collegeId);

}
