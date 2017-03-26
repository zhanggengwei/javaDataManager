package com.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.*;

/**
 * Created by vd on 2017/3/25.
 */
public class DataManager {
    private static DataManager ourInstance = new DataManager();
    private Connection connection = null;

    public Statement getStatement() {
        return statement;
    }

    private Statement statement = null;

    public PreparedStatement getPreparedStatement() {
        return preparedStatement;
    }

    private PreparedStatement preparedStatement = null;
    private ManagerReadProfile readProfile = null;
    public static DataManager getInstance()
    {
        return ourInstance;
    }

    private DataManager()
    {
        this.readProfile = new ManagerReadProfile("src/dataBase.properties");
        String dataBaseUrl = this.readProfile.propertyValueForKey("baseUrl");
        String root = this.readProfile.propertyValueForKey("userName");
        String passWord = this.readProfile.propertyValueForKey("passWord");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                this.connection = DriverManager.getConnection(dataBaseUrl, root, passWord);
                this.statement = this.connection.createStatement();
            }catch (SQLException e)
            {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(dataBaseUrl);
        System.out.println(root);
        System.out.println(passWord);
    }
}
class ManagerReadProfile
{
    private String filePath = null;
    private Properties properties = null;
    public ManagerReadProfile(String filePath)
    {
        this.filePath = filePath;
        this.read();
    }
    public  String propertyValueForKey(String keyString)
    {
        return this.properties.getProperty(keyString);
    }
    private  void  read()
    {
        this.properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(this.filePath)));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}





