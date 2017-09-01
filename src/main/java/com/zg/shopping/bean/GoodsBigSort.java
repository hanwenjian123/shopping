package com.zg.shopping.bean;

import lombok.Data;

/**
 * Created by lenovo on 2017/8/22.
 * 大的商品类别信息表（t_goodsBigSort）
 */
@Data
public class GoodsBigSort {
    private int gbsId;
    private String goodsCategory;//商品类型
    private int gsid;//商品Id
}
