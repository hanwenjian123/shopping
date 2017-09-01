package com.zg.shopping.service.serviceImpl;

import com.zg.shopping.bean.FenPage;
import com.zg.shopping.bean.Goods;
import com.zg.shopping.mapper.FootPrintMapper;
import com.zg.shopping.mapper.GoodsLittleSortMapper;
import com.zg.shopping.service.FootParintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/8/24.
 */
@Service
public class FootPrintImpl implements FootParintService {
    //创建mapper
    @Autowired
    private FootPrintMapper footPrintMapper;


    @Override
    public List<Goods> selectGoodsByUser(int userId) {
        return footPrintMapper.selectGoodsByUser(userId);
    }

    @Override
    public void deleteGoods(int userId, int gsid) {
        footPrintMapper.deleteGoods(userId,gsid);
    }

    @Override
    public List<Goods> similar(FenPage fenPage) {
        return footPrintMapper.similar(fenPage);
    }

    @Override
    public List<Goods> similarAll(String goodsname) {
        return footPrintMapper.similarAll(goodsname);
    }


}
