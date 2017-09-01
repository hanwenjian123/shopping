package com.zg.shopping.mapper;

import com.zg.shopping.bean.Indent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/8/24.
 */
@Mapper
@Component
public interface NewsMapper {

    //查询订单
    List<Indent> selectIndent(int userId);
}
