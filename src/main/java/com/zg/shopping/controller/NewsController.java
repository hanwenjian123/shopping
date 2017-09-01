package com.zg.shopping.controller;

import com.zg.shopping.bean.Goods;
import com.zg.shopping.bean.Indent;
import com.zg.shopping.service.FootParintService;
import com.zg.shopping.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/8/24.
 */
@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;


     @RequestMapping("selectnews")
    public String selectNews(Model model){
         List<Indent> indents = newsService.selectIndent(1);
         for (Indent indent : indents) {
             System.out.println(indent);
         }

         model.addAttribute("news",indents);
         return "person/news";
    }



}
