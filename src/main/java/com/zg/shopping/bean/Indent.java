package com.zg.shopping.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by lenovo on 2017/8/22.
 * 订单表（t_indent）
 */
@Data
public class Indent {

    private int inId;//订单表主键ID
    private Date orderTime;//下单时间
    private double indentMoney;//订单金额
    private String indentAddress;//订单的收货地址
    private String indentNumber;//订单号
    private int userId;//订单人
    private String indentStatus;//订单状态
    private String goodsname;//商品名称

}
