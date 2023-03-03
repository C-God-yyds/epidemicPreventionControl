package cn.easthome.skd.springbootskd01.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 整个项目的工具类：
 * 封装各种工具方法
 */
public class SKDUtils {

    //获取格式化时间字符串的方法
    public static String get_time(){
        //获取当前时间
        Date date = new Date();
        //借助simpleDateFormate格式化字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(date);
        return strTime;
    }
}
