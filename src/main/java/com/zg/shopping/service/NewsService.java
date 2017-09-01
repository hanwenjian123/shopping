package com.zg.shopping.service;

import com.zg.shopping.bean.Indent;

import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/8/24.
 */

public interface NewsService {
    //查询订单
    List<Indent> selectIndent(int userId);
}
