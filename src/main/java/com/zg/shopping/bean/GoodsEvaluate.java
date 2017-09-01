package com.zg.shopping.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by lenovo on 2017/8/22.
 * 商品评价表*（t_goodsEvaluate）
 */
@Data
public class GoodsEvaluate {
    private int gsID;//商品评价表主键ID
    private String userName;//评价的用户名
    private String geMsg;//评价的内容
    private int  gsid;//商品主键ID
    private int geCount;//评价的总条数
    private Date geDate;//评价的时间


}
