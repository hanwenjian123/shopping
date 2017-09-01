package com.zg.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fengshuo on 2017/8/23.
 */
@Controller
public class indexController {

    //主页
    @RequestMapping("/")
    private String index(){
        return "home/home";
    }

    //页面头
    @RequestMapping("head")
    private String head(){
        return "head";
    }

    //页面尾
    @RequestMapping("foot")
    private String foot(){
        return "foot";
    }

    @RequestMapping("footprint")
    private String footprint(){
        return "person/foot";
    }
     @RequestMapping("intr")
    private String introduction(){
        return "home/introduction";
    }
       @RequestMapping("s")
    public String s(){
        return "home/login";
    }
     @RequestMapping("s1")
    private String s1(){
        return "home/pay";
    }
     @RequestMapping("s2")
    private String s2(){
        return "home/register";
    }
 @RequestMapping("search")
    private String search(){
        return "home/search";
    }
 @RequestMapping("s4")
    private String s4(){
        return "person/information";
    }
@RequestMapping("s5")
    private String s5(){
        return "person/sort";
    }
@RequestMapping("s6")
    private String s6(){
        return "person/index";
    }

}
