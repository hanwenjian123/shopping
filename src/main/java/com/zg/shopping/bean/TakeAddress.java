package com.zg.shopping.bean;

import lombok.Data;

/**
 * Created by lenovo on 2017/8/22.
 * 收货地址表（t_takeAddress）
 */
@Data
public class TakeAddress {
    private int tid;//地址表的主键ID
    private int userId;//用户的主键ID
    private String consignee;//收货人
    private String address;//收货所在地
    private String addressDetails;//收货地址详情信息



}
