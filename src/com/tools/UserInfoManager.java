package com.tools;

import com.Manager.Beans.UserInfo;

import javax.xml.crypto.Data;
import java.sql.SQLException;

/**
 * Created by vd on 2017/3/26.
 */
public class UserInfoManager
{
    private static DataManager manager = null;

    public static Integer registerUserInfo(UserInfo info)
    {
        manager = DataManager.getInstance();
        String sql = "insert into  User_Info " +
                "(phone,nickName,passWord,region) values(?,?,?,?)";
        sql = sql.replaceFirst("\\?",""+info.getPhone()+"");
        sql = sql.replaceFirst("\\?",""+info.getNickName()+"");
        sql = sql.replaceFirst("\\?",""+info.getPassWord()+"");
        sql = sql.replaceFirst("\\?",""+info.getRegion()+"");
        Integer sucess = 0;
        try {
            sucess = manager.getStatement().executeUpdate(sql);


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sucess;
    }

}
