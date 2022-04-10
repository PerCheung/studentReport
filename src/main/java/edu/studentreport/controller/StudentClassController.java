package edu.studentreport.controller;

import edu.studentreport.entity.StudentClass;
import edu.studentreport.service.StudentClassService;
import edu.studentreport.util.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 班级(StudentClass)表控制层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
@RestController
@RequestMapping("studentClass")
@CrossOrigin(origins = "*")
public class StudentClassController {
    /**
     * 服务对象
     */
    @Resource
    private StudentClassService studentClassService;

    /**
     * 查找所有班级及所属学院
     *
     * @return
     */
    @GetMapping("all")
    public R queryAll() {
        return R.ok().setData(this.studentClassService.queryCCAll());
    }

    /**
     * 查找所有班级
     */
    @GetMapping("/class/all")
    public R queryAllClass() {
        return R.ok().setData(this.studentClassService.queryAll());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<StudentClass> queryById(@PathVariable("id") String id) {
        return ResponseEntity.ok(this.studentClassService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param studentClass 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<StudentClass> add(@RequestBody StudentClass studentClass) {
        return ResponseEntity.ok(this.studentClassService.insert(studentClass));
    }

    /**
     * 编辑数据
     *
     * @param studentClass 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<StudentClass> edit(@RequestBody StudentClass studentClass) {
        return ResponseEntity.ok(this.studentClassService.update(studentClass));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.studentClassService.deleteById(id));
    }

}

