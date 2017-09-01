package com.zg.shopping.controller;

import com.zg.shopping.bean.FenPage;
import com.zg.shopping.bean.Goods;
import com.zg.shopping.service.FootParintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by ${hanwenjian} on 2017/8/24.
 */
@Controller
public class FootPrintController {

    @Autowired
    private FootParintService footParintService;

    //
    @RequestMapping("zuji")
    public String userBuy(Model model) {
        System.out.println("-----zuji-----");
        List<Goods> goods = footParintService.selectGoodsByUser(1);
        model.addAttribute("goods", goods);
        return "person/foot";
    }

    //删除
    @RequestMapping("del")
    public String del(int gsid) {
        System.out.println("-----dedede-----" + gsid);
        footParintService.deleteGoods(2, gsid);
        return "forward:userbuy";
    }

   /* http://qr.liantu.com/api.php?&w=200&text=http://localhost:8081*/
    //查询相似
    @RequestMapping("similar")
    public String similar(HttpSession session, Integer pageNum, String goodsname, Model model) {
        System.out.println("-----similar-----");
        if (goodsname != null) {
            session.setAttribute("name", goodsname);
        }
        String name = (String) session.getAttribute("name");

        List<Goods> all = footParintService.similarAll(name);
        System.out.println(name);
        for (Goods goods : all) {
            System.out.println(goods);
        }
        int size = all.size();
        //算出一共有多少页
        int num = size / 3 + (size % 3 > 0 ? 1 : 0);
        model.addAttribute("num", num);


        //为了程序的严谨性，判断非空：
        pageNum = pageNum == null ? 0 : pageNum;
        //pageSize = pageSize == null ? 3 : pageSize;
        if (pageNum < 0) pageNum = 0;
        if (pageNum >= num) pageNum = num - 1;
        model.addAttribute("pageNum", pageNum);
        FenPage fenPage = new FenPage();
        fenPage.setGoodsname(name);
        fenPage.setPagenum(pageNum * 3);
        fenPage.setPagesize(3);

        List<Goods> similar = footParintService.similar(fenPage);

        for (Goods goods : similar) {
            System.out.println(goods);
        }
        model.addAttribute("similar", similar);

        return "home/search";

    }


}
