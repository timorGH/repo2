package com.chinasoft.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyConvert implements Converter<String,Date>{


    @Override
    public Date convert(String s) {
        Date date = null;
        if(s == null){
            throw new RuntimeException("输入日期为空");
        }else{
            try {
                //将日期字符串转化为日期类型(yyyy-MM-dd HH:mm:ss)
                //转化成功返回Date，否则返回null
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                date = simpleDateFormat.parse(s);
            }
            catch (ParseException e) {
                e.printStackTrace();
                throw new RuntimeException("转换日期格式失败");
            }
        }


        return date;
    }
}
