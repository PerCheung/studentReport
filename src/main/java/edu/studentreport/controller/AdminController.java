package edu.studentreport.controller;

import edu.studentreport.entity.Admin;
import edu.studentreport.service.AdminService;
import edu.studentreport.util.MD5Util;
import edu.studentreport.util.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 管理员(Admin)表控制层
 *
 * @author Peter Cheung
 * @since 2022-04-08 19:52:28
 */
@RestController
@RequestMapping("admin")
@CrossOrigin(origins = "*")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    /**
     * 注册所需验证码
     */
    @Value("${student.report.admin.verification.code}")
    private String Code;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Admin> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.adminService.queryById(id));
    }

    /**
     * 注册
     *
     * @param admin 实体
     * @return 新增结果
     */
    @PostMapping("reg")
    public R add(@RequestBody Admin admin) {
        if (!Code.equals(admin.getCode())) {
            return R.fail().setData("验证码错误");
        }
        return R.ok().setData(this.adminService.insert(admin));
    }

    /**
     * 修改密码
     *
     * @param admin 实体
     * @return 编辑结果
     */
    @PutMapping
    public R edit(@RequestBody Admin admin) {
        if (!MD5Util.toMd5(admin.getAdminPassword()).equals(adminService.queryByAdminUsername(admin.getAdminUsername()))) {
            return R.fail().setData("旧密码错误");
        }
        return R.ok().setData(adminService.update(admin));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.adminService.deleteById(id));
    }

    /**
     * 登录
     */
    @PostMapping("/login")
    public R AdminLogin(@RequestBody Admin admin) {
        int i = adminService.loginAdmin(admin);
        if (i == 0 || i == 2) {
            return R.fail().setData(i);
        }
        if (i == 1) {
            return R.ok().setData(i);
        }
        return R.exp().setData("未知错误");
    }
}

