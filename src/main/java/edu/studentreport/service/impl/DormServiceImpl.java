package edu.studentreport.service.impl;

import edu.studentreport.dao.DormDao;
import edu.studentreport.entity.Dorm;
import edu.studentreport.service.DormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 宿舍(Dorm)表服务实现类
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
@Service("dormService")
public class DormServiceImpl implements DormService {
    @Resource
    private DormDao dormDao;

    /**
     * 查找所有
     * @return
     */
    @Override
    public List<Dorm> queryAll() {
        return this.dormDao.queryAll();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param dormId 主键
     * @return 实例对象
     */
    @Override
    public Dorm queryById(String dormId) {
        return this.dormDao.queryById(dormId);
    }

    /**
     * 新增数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    @Override
    public Dorm insert(Dorm dorm) {
        this.dormDao.insert(dorm);
        return dorm;
    }

    /**
     * 修改数据
     *
     * @param dorm 实例对象
     * @return 实例对象
     */
    @Override
    public Dorm update(Dorm dorm) {
        this.dormDao.update(dorm);
        return this.queryById(dorm.getDormId());
    }

    /**
     * 通过主键删除数据
     *
     * @param dormId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String dormId) {
        return this.dormDao.deleteById(dormId) > 0;
    }
}
