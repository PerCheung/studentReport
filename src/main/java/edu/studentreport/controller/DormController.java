package edu.studentreport.controller;

import edu.studentreport.entity.Dorm;
import edu.studentreport.service.DormService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 宿舍(Dorm)表控制层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
@RestController
@RequestMapping("admin/dorm")
public class DormController {
    /**
     * 服务对象
     */
    @Resource
    private DormService dormService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Dorm> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.dormService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param dorm 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Dorm> add(@RequestBody Dorm dorm) {
        return ResponseEntity.ok(this.dormService.insert(dorm));
    }

    /**
     * 编辑数据
     *
     * @param dorm 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Dorm> edit(@RequestBody Dorm dorm) {
        return ResponseEntity.ok(this.dormService.update(dorm));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.dormService.deleteById(id));
    }

}

