package com.zg.shopping.service.serviceImpl;

import com.zg.shopping.bean.GoodsLittleSort;
import com.zg.shopping.mapper.GoodsLittleSortMapper;
import com.zg.shopping.service.GoodsLittleSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/8/22.
 */
@Service
public class GoodsLittleSortServiceImpl implements GoodsLittleSortService {

    //创建mapper
    @Autowired
    private GoodsLittleSortMapper goodsLittleSortMapper;

    @Override
    public void addGoodsLittleSort(GoodsLittleSort goodsLittleSort) {
        goodsLittleSortMapper.addGoodsLittleSort(goodsLittleSort);
    }
}
