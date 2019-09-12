package com.youyuan.mine_mappers;

import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

/**
 * @author zhangyu
 * @version 1.0
 * @description 自定义mapper接口
 * @date 2019/4/12 13:46
 */
public interface MyMapper<T> extends SelectAllMapper<T>,SelectByExampleMapper<T>,MyBatchUpdateMapper<T> {

}
