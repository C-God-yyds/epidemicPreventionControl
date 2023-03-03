package cn.easthome.skd.springbootskd01.service;

import cn.easthome.skd.springbootskd01.entity.History;
import cn.easthome.skd.springbootskd01.repository.HistoryRepository;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HistoryService {

    @Autowired
    HistoryRepository historyRepository;

    @Transactional
    public String findLeft1() {
        List<History> datas = historyRepository.findAll();
//        System.out.print(datas);
        //把获取的数据转换为json字符串
        List ds = new ArrayList();
        List confirm = new ArrayList();
        List suspect = new ArrayList();
        List heal = new ArrayList();
        List dead = new ArrayList();
        Map<String, Object> map = new HashMap<String, Object>();
        SimpleDateFormat sdf = new SimpleDateFormat("MM:dd");
        for (History history : datas) {
            String time = sdf.format(history.getDs());
            ds.add(time);
            confirm.add(history.getConfirm());
            suspect.add(history.getSuspect());
            heal.add(history.getHeal());
            dead.add(history.getDead());
        }
        map.put("ds", ds);
        map.put("confirm", confirm);
        map.put("suspect", suspect);
        map.put("heal", heal);
        map.put("dead", dead);
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(map);
        String jsonStr = jsonArray.toString();
        return jsonStr;
    }

    @Transactional
    public String findLeft2() {
        List<History> datas2 = historyRepository.findAll();
//        System.out.print(datas);
        //把获取的数据转换为json字符串
        List ds = new ArrayList();
        List confirm_add = new ArrayList();
        List suspect_add = new ArrayList();
//        List heal_add = new ArrayList();
//        List dead_add = new ArrayList();
        Map<String, Object> map = new HashMap<String, Object>();
        SimpleDateFormat sdf = new SimpleDateFormat("MM:dd");
        for (History history : datas2) {
            String time = sdf.format(history.getDs());
            ds.add(time);
            confirm_add.add(history.getConfirm_add());
            suspect_add.add(history.getSuspect_add());
//            heal_add.add(history.getHeal_add());
//            dead_add.add(history.getDead_add());
        }
        map.put("ds", ds);
        map.put("confirm_add", confirm_add);
        map.put("suspect_add", suspect_add);
//        map.put("heal_add", heal_add);
//        map.put("dead_add", dead_add);
        JSONArray jsonArray2 = new JSONArray();
        jsonArray2.add(map);
        String jsonStr2 = jsonArray2.toString();
        return jsonStr2;
    }

    @Transactional
    public String get_center1(){
        List<History> datas=historyRepository.findAll();
        JSONArray strJson=new JSONArray();
        int a=0,b=0,c=0,d=0;
        for (History history:datas){
            a=history.getConfirm();
            b=history.getDead();
            c=history.getHeal();
            d=history.getSuspect();
        }
        Map<String,Object> maps=new HashMap<>();
        maps.put("confirm",a);
        maps.put("suspect",d);
        maps.put("heal",c);
        maps.put("dead",b);
        strJson.add(maps);
        return strJson.toString();
    }

}
