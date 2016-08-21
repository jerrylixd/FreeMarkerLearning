package com.liyang.freeMarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/8/21.
 */
@Controller
@RequestMapping("/freeMarker/test1")
public class Test1Controller {
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        String word0 = "Hello ";
        String word1 = "World!";
        //将数据添加到视图数据容器中
        model.addAttribute("word0",word0);
        model.addAttribute("word1",word1);
        return "Hello.ftl";
    }
}
