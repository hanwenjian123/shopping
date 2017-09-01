package com.zg.shopping.bean;

import lombok.Data;

/**
 * Created by lenovo on 2017/8/22.
 * 小的商品类别信息表（t_goodsLittleSort）
 */
@Data
public class GoodsLittleSort {
    private int glsId;//小的类别的ID
    private String glsCategory;//小的类别类型
    private int gbsId;//大的外键

}
