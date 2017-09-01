package com.zg.shopping.mapper;

import com.zg.shopping.bean.GoodsLittleSort;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2017/8/22.
 */
@Mapper
@Component
public interface GoodsLittleSortMapper {
    /**
     * 添加小分类
     */
    public void addGoodsLittleSort(GoodsLittleSort goodsLittleSort);

}
