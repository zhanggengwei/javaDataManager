package com.tools;

import com.Manager.Beans.UserInfo;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        sql = StringDBUtil.DBStringValue(sql,info.getPhone(),info.getNickName(),info.getPassWord(),info.getRegion());
        Integer sucess = 0;
        try {
            sucess = manager.getStatement().executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sucess;
    }

    public static UserInfo LoginUserInfo(String phone,String passWord)
    {
        manager = DataManager.getInstance();
        String searchSql = "select * from User_Info where phone = ? and passWord = ?";
        searchSql = StringDBUtil.DBStringValue(searchSql,phone,passWord);
        ResultSet resultSet = null;
        UserInfo userInfo = null;
        try {
            resultSet = manager.getStatement().executeQuery(searchSql);
            if(resultSet.next()!=false)
            {
                userInfo = new UserInfo();
                userInfo.setIdenfity(resultSet.getString("identify"));
                userInfo.setPhone(resultSet.getString("phone"));
                userInfo.setNickName(resultSet.getString("nickName"));
                userInfo.setPassWord(resultSet.getString("passWord"));
                userInfo.setRegion(resultSet.getString("region"));
                userInfo.setRegister(resultSet.getString("register"));

            }else
            {
                System.out.println("不存在该用户");
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return userInfo;
    }

}
