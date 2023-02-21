package com.jxd.student.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jxd.student.model.Student;
import org.apache.ibatis.annotations.Param;

public interface IStudentDao extends BaseMapper<Student> {

    IPage<Student> getAllStudentList(IPage<Student> page, @Param("name") String name);

}
