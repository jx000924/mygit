package com.jxd.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.student.model.Student;

import java.util.Map;

public interface IStudentService extends IService<Student> {

    Map<String, Object> getAllStudentList(Map<String,String> map);
}
