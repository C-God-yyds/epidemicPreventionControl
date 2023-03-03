package cn.easthome.skd.springbootskd01.service;

import cn.easthome.skd.springbootskd01.entity.Details;
import cn.easthome.skd.springbootskd01.repository.DetailsRepository;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DetailsService {

    @Autowired
    DetailsRepository detailsRepository;

    public String get_right1(){

        List < Details > datas = detailsRepository.findAll(Sort.by(Sort.Direction.DESC, "confirm"));
        JSONArray strJson=new JSONArray();
        List city=new ArrayList();
        List confirm=new ArrayList();
        int i=0;
        for (Details details:datas){
            if (!details.getCity().equals("地区待确认")&&!details.getCity().equals("境外输入")&&!details.getProvince().equals("湖北")){
                city.add(details.getCity());
                confirm.add(details.getConfirm());
                i++;
            }
            if (i==5){
                break;
            }
        }
        Map<String,Object> maps=new HashMap<>();
        maps.put("city",city);
        maps.put("confirm",confirm);
        strJson.add(maps);
        return strJson.toString();
    }

    public String get_center2(){
        List<Details> datas=detailsRepository.findAll();
        //System.out.println(datas);
        JSONArray strJson=new JSONArray();
        JSONArray strJson1=new JSONArray();
        Map<String,Integer> map=new HashMap<>();
        for (Details details:datas){
            map.merge(details.getProvince(), details.getConfirm(), Integer::sum);
        }
        Set set = map.keySet();
        for(Iterator iter = set.iterator(); iter.hasNext();) {
            String key = (String)iter.next();
            Integer value = map.get(key);
            Map<String,Object> maps=new HashMap<>();
            maps.put("name",key);
            maps.put("value",value);
            strJson.add(maps);
        }
        Map<String,Object> mapes=new HashMap<>();
        mapes.put("data",strJson.toString());
        strJson1.add(mapes);
        return strJson.toString();
    }

    public String get_right2(){
        Map<String,Integer> map =new HashMap<>();
        Map<String,Object> mapes =new HashMap<>();
        JSONArray strJson=new JSONArray();
        JSONArray strJson1=new JSONArray();
        map.put("天津",102);
        map.put("肺炎",112);
        map.put("动态",100);
        map.put("归来",11);
        map.put("感染者",22);
        map.put("湖北",62);
        map.put("疑似",42);
        map.put("发起",112);
        map.put("新冠",82);
        map.put("曝光",12);
        map.put("好转",32);
        map.put("病毒",52);
        map.put("复工",72);
        map.put("限制",62);
        map.put("隔离",34);
        map.put("宵禁",62);
        map.put("抗疫",23);
        map.put("防控",68);
        map.put("部署",62);
        map.put("交叉",77);
        map.put("扶贫",42);
        map.put("咳嗽",27);
        Set set = map.keySet();
        for(Iterator iter = set.iterator(); iter.hasNext();) {
            String key = (String)iter.next();
            Integer value = map.get(key);
            Map<String,Object> maps=new HashMap<>();
            maps.put("name",key);
            maps.put("value",value);
            strJson.add(maps);
        }
        return strJson.toString();
    }


}
