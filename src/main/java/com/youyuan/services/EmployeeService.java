package com.youyuan.services;

import com.youyuan.entities.Employee;
import com.youyuan.mappers.EmployeeMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description
 * @date 2019/4/9 22:29
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    public List<Employee> getAll() {
        return employeeMapper.selectAll();
    }

    public void batchUpdate(List<Employee> list) {
        employeeMapper.batchUpdate(list);
    }
}
