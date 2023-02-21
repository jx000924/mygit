package com.jxd.student.controller;

import com.jxd.student.dao.IStudentDao;
import com.jxd.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author zhangchenyang
 * @Date 2023/2/21
 * @Version 1.0
 */
@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    /**
     *
     * @param map 四个参数  limit  page  ename  deptno
     * @return  返回数据中包括 data:所有列表数据， count总条数
     */
    @RequestMapping("/list")
    public Map<String,Object> list(@RequestBody Map<String,String> map){
        return studentService.getAllStudentList(map);
    }


}
