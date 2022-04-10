package edu.studentreport.controller;

import edu.studentreport.entity.College;
import edu.studentreport.service.CollegeService;
import edu.studentreport.util.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学院(College)表控制层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
@RestController
@RequestMapping("college")
@CrossOrigin(origins = "*")
public class CollegeController {
    /**
     * 服务对象
     */
    @Resource
    private CollegeService collegeService;

    /**
     * 查找所有
     *
     * @return
     */
    @GetMapping("all")
    public R queryAll() {
        return R.ok().setData(this.collegeService.queryAll());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<College> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.collegeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param college 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<College> add(@RequestBody College college) {
        return ResponseEntity.ok(this.collegeService.insert(college));
    }

    /**
     * 编辑数据
     *
     * @param college 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<College> edit(@RequestBody College college) {
        return ResponseEntity.ok(this.collegeService.update(college));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.collegeService.deleteById(id));
    }

}

