package com.zg.shopping.bean;

import lombok.Data;

/**
 * Created by lenovo on 2017/8/22.
 * 用户购买记录表（t_userBuy）
 */
@Data
public class UserBuy {
    private int ubId;
    private int gsid;//商品主键ID
    private int userId;//用户主键ID



}
