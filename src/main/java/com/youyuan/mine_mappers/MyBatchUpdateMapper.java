package com.youyuan.mine_mappers;

import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * @author zhangyu
 * @version 1.0
 * @description 扩展的批量更新的mapper
 * @date 2019/4/12 15:09
 */
public interface MyBatchUpdateMapper<T> {

    @UpdateProvider(type = MyBatchUpdateProvider.class,method = "dynamicSQL")
    void batchUpdate(List<T> list);
}
