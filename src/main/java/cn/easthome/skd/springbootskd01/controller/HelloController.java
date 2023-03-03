package cn.easthome.skd.springbootskd01.controller;

import cn.easthome.skd.springbootskd01.util.SKDUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    //响应字符串到前端页面
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello World!";
    }

    //响应一个html页面到前端
    @RequestMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("index");
        return mav;
    }

    //获取系统时间的方法
    @ResponseBody
    @RequestMapping(value = "/get_time", method = RequestMethod.POST)
    public String get_time(){
        //获取系统时间
        String strTime = SKDUtils.get_time();
        return strTime;
    }
}
