package com.jxd.student.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.student.dao.IStudentDao;
import com.jxd.student.model.Student;
import com.jxd.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author zhangchenyang
 * @Date 2023/2/21
 * @Version 1.0
 */
@Service
public class StudentServiceImpl extends ServiceImpl<IStudentDao, Student> implements IStudentService {

    @Autowired
    private IStudentDao studentDao;


    @Override
    public Map<String, Object> getAllStudentList(Map<String,String> queryMap) {
        String page = queryMap.get("page");
        String limit = queryMap.get("limit");
        String name = queryMap.get("name");

        Map<String, Object> map = new HashMap(4);
        if(page != null && limit != null){
            IPage<Student> pages = new Page(Integer.parseInt(page),Integer.parseInt(limit));
            IPage<Student> pageResult = studentDao.getAllStudentList(pages,name);
            map.put("count",pageResult.getTotal());
            map.put("data",pageResult.getRecords());
            map.put("code",0);
            return map;
        }else{
            map.put("data", (Object)null);
            map.put("code", "500");
            map.put("msg", "参数不符");
            map.put("count", (Object)null);
            return map;
        }

    }


}
