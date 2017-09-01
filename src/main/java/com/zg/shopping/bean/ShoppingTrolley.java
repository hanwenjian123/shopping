package com.zg.shopping.bean;

import lombok.Data;

/**
 * Created by lenovo on 2017/8/22.
 * 购物车（t_shoppingTrolley）
 */
@Data
public class ShoppingTrolley {
    private int shid;//购物车主键ID
    private int gid;//商品主键
    private int userID;//用户主键

}
