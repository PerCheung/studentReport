package edu.studentreport.dao;

import edu.studentreport.vo.CollegeAndClassVO;

import java.util.List;

/**
 * @author Peter Cheung
 * @date 2022/4/10 16:39
 */
public interface CollegeAndClassVODao {
    /**
     * 查询所有
     */
    List<CollegeAndClassVO> queryAll();
}
