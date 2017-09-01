package com.zg.shopping.service.serviceImpl;

import com.zg.shopping.bean.Indent;
import com.zg.shopping.mapper.NewsMapper;
import com.zg.shopping.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/8/24.
 */
@Service
public class NewsImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;
    @Override
    public List<Indent> selectIndent(int userId) {
        return newsMapper.selectIndent(userId);
    }
}
