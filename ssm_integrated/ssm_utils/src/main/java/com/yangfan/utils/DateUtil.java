package com.yangfan.utils;

/**
 * @Description: java类作用描述
 * @Author: yf_mood
 * @CreateDate: 2018/11/9$ 18:47$
 * @Version: "10.0.1" 2018-04-17
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**字符串与日期格式相互转换
 *
 */
public class DateUtil {
    public static Date stringtoDate(String a) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = format.parse(a);
        return date;
    }
    public static String datetoString(Date b) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s = format.format(b);
        return s;
    }
}
