package com.tools;

import java.util.ArrayList;

/**
 * Created by vd on 2017/3/26.
 */
public class StringDBUtil
{
    public  static String DBStringValue(String sql,String ...args)
    {
        String sqlString = sql;
        for (String value:args)
        {
            value = "\""+value+"\"";


           sqlString = sqlString.replaceFirst("\\?",value);

        }
        return sqlString;
    }
}
