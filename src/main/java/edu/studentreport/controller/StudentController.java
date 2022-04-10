package edu.studentreport.controller;

import edu.studentreport.entity.Student;
import edu.studentreport.service.StudentService;
import edu.studentreport.util.R;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学生(Student)表控制层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:29
 */
@RestController
@RequestMapping("student")
@CrossOrigin(origins = "*")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 查找所有
     *
     * @return
     */
    @GetMapping("all")
    public R queryAll() {
        return R.ok().setData(this.studentService.queryAll());
    }

    /**
     * 查询所有已缴费且无分配宿舍学生
     */
    @GetMapping("isPay")
    public R queryAllisPay() {
        return R.ok().setData(this.studentService.queryAllisPay());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Student> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.studentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param student 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Student> add(@RequestBody Student student) {
        return ResponseEntity.ok(this.studentService.insert(student));
    }

    /**
     * 增加新生
     */
    @PostMapping("new")
    public R addNew(@RequestBody Student student) {
        student.setDormId("0");
        student.setIsPay(0);
        String studentCid = student.getStudentCid();
        String substring = studentCid.substring(studentCid.length() - 6);
        student.setStudentPassword(substring);
        long l = this.studentService.queryMaxByClassName(student.getClassName());
        l++;
        student.setStudentId((int) l);
        return R.ok().setData(this.studentService.insert(student));
    }

    /**
     * 编辑数据
     *
     * @param student 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Student> edit(@RequestBody Student student) {
        return ResponseEntity.ok(this.studentService.update(student));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.studentService.deleteById(id));
    }

    /**
     * 登录
     *
     * @param student
     * @return
     */
    @PostMapping("/login")
    public R Login(@RequestBody Student student) {
        int i = studentService.loginStudent(student);
        if (i == 0 || i == 2) {
            return R.fail().setData(i);
        }
        if (i == 1) {
            return R.ok().setData(i);
        }
        return R.exp().setData("未知错误");
    }
}

