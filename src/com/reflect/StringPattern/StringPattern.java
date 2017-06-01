package com.reflect.StringPattern;

import java.util.TreeSet;

/**
 * Created by vd on 2017/3/27.
 */
public class StringPattern {
    private static String numberRegex = "\\d";
    private static String URLRegex = "";
    private static String passWordRegex = "\\w";
    private static String QQRegex = "^[1-9]\\d{4,14}";

    public static Boolean isNumber(String regex)
    {
       return regex.matches(numberRegex);
    }

//    判断qq号码
    public static Boolean isQQFormatter(String string)
    {
        return string.matches(QQRegex);
    }


    /*
    *  // 分组
    *  叠词
    *  (.)//1+
    *  String str = "zjlloooookkkk";
    *  str.replaceAll("(.)\\1++","$1");"$1" 代表着第一组的数据
    *  zjlok
    *
    *  18863014571
    *  str.replaceAll("(\\d{3})\\d{4}(\\d{4})"),"$1****$2";
    *  188****4571
    *
    *
    *
    * */

    /*
    * 1.治疗口吃，我要要要学习习习习习习程程程程程程程序
    * 2 IP地址排序 192.168.10.34 [1-2]{3}\\.
    * 3 邮箱地址的校验
    * */

   public static void sortIPAddress()
   {
       String address = "127.0.0.1  192.168.1.2 255.0.3.4 3.3.3.3";
       //使用添零
       address = address.replaceAll("(\\d+)","00$1");
       address = address.replaceAll("0*(\\d{3})","$1");

       String ip_arr[]= address.split(" +");
       TreeSet<String> treeSet = new TreeSet<String>();
       for (String str:ip_arr)
       {
           treeSet.add(str);
       }
       for (String str:treeSet) {
           System.out.println(str.replaceAll("0*(\\d+)", "$1"));

       }
   }
   public static Boolean emailAddress(String email)
   {
       Boolean isEmail = false;
       String emailRegex = "[0-9a-zA-Z-]+@[0-9a-zA-Z]+\\.[a-zA-Z]{1,4}";
       return  true;
   }


}
