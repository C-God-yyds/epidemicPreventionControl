package cn.easthome.skd.springbootskd01.controller;

import cn.easthome.skd.springbootskd01.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DetailsController {

    @Autowired
    DetailsService detailsService;

    @ResponseBody
    @RequestMapping(value = "/get_right1",method = RequestMethod.POST)
    public String get_right1(){
        //查询history表获取left1中的数据
        System.out.print(detailsService.get_right1());
        return detailsService.get_right1();
    }

    @ResponseBody
    @RequestMapping(value = "/get_center2",method = RequestMethod.POST)
    public String get_center2(){
        //查询history表获取center2中的数据
        System.out.print(detailsService.get_center2());
        return detailsService.get_center2();
    }

    @ResponseBody
    @RequestMapping(value = "/get_right2",method = RequestMethod.POST)
    public String get_right2(){
        //查询history表获取center2中的数据
        System.out.print(detailsService.get_right2());
        return detailsService.get_right2();
    }
}
