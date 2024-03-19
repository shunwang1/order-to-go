package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetMealDishMapper {

    /**
     * 根据菜品ID查询对应的套餐ID
     * @param dishIds
     * @return
     */
    List<Long> getSetMealIdByDishIs(List<Long> dishIds);
}
