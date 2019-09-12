package com.youyuan.mappers;

import com.youyuan.entities.Employee;
import com.youyuan.mine_mappers.MyMapper;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author zhangyu
 * @version 1.0
 * @description 自定义接口需要继承通用Mapper的mapper接口,里面的泛型是要操作的表对应的bean
 * @date 2019/4/9 22:25
 *
 * @CacheNamespace  注解开启二级缓存
 *
 */
@CacheNamespace
public interface EmployeeMapper extends MyMapper<Employee> {

}
