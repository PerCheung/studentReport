package edu.studentreport.service;

import edu.studentreport.entity.Dorm;

/**
 * 宿舍(Dorm)表服务接口
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
public interface DormService {

    /**
     * 通过ID查询单条数据
     *
     * @param dormId 主键
     * @return 实例对象
     */
    Dorm queryById(String dormId);

    /**
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    Dorm insert(Dorm dorm);

    /**
     * 修改数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    Dorm update(Dorm dorm);

    /**
     * 通过主键删除数据
     *
     * @param dormId 主键
     * @return 是否成功
     */
    boolean deleteById(String dormId);

}
