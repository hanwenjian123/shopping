package com.zg.shopping.mapper;

import com.zg.shopping.bean.FenPage;
import com.zg.shopping.bean.Goods;
import com.zg.shopping.bean.UserBuy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/8/24.
 */
@Mapper
@Component
public interface FootPrintMapper {

    //购买记录
    List<Goods> selectGoodsByUser (int userId);
    //删除记录
    void deleteGoods(int userId,int gsid);
    //找相似
    List<Goods> similar(FenPage fenPage);
    //找相似
    List<Goods> similarAll(String goodsname);

}
