package com.md.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 *
 * @author mengdong
 * @create 2018-11-11 22:31
 */
@Controller
public class PageController {
    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/")
    public String showIndex() {
        System.out.println("=====showIndex");
        return "index";
    }

    /**
     * 其他页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        System.out.println("=====showPage："+page);
        return page;
    }
}
