package cn.easthome.skd.springbootskd01.controller;

import cn.easthome.skd.springbootskd01.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HistoryController {

    @Autowired
    HistoryService historyService;

    //获取left1中的数据
    @ResponseBody
    @RequestMapping(value = "/get_left1", method = RequestMethod.POST)
    public String get_left1(){
        //查询history表获取left1中的数据
        System.out.print(historyService.findLeft1());
        String jsonLeft1 = historyService.findLeft1();
        return jsonLeft1;
    }
    //获取left2中的数据
    @ResponseBody
    @RequestMapping(value = "/get_left2", method = RequestMethod.POST)
    public String get_left2(){
        //查询history表获取的left2中的数据
        System.out.print(historyService.findLeft2());
        String jsonLeft2 = historyService.findLeft2();
        return jsonLeft2;
    }

    //获取center1中的数据
    @ResponseBody
    @RequestMapping(value = "/get_center1", method = RequestMethod.POST)
    public String get_center1(){
        //查询history表获取的center1中的数据
        System.out.print(historyService.get_center1());
        String jsonCenter1 = historyService.get_center1();
        return jsonCenter1;
    }
}
