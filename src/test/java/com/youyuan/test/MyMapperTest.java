package com.youyuan.test;

import com.youyuan.entities.Employee;
import com.youyuan.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description
 * @date 2019/4/12 14:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class MyMapperTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSelectAll(){
        List<Employee> employeeList=employeeService.getAll();
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    @Test
    public void testBatchUpdate(){
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(3,"emp03",3000.22,33));
        list.add(new Employee(4,"emp04",4000.33,34));
        list.add(new Employee(4,"emp05",5000.55,35));

        employeeService.batchUpdate(list);
    }

    @Test
    public void testCacheSelectAll(){
        List<Employee> employeeList = employeeService.getAll();
        for (Employee employee:employeeList){
            System.out.println(employee);
        }


        employeeList=employeeService.getAll();
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }
}
