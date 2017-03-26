package com.Manager.Beans;

/**
 * Created by vd on 2017/3/26.
 */
public class UserInfo
{

    private String idenfity;
    private String phone;
    private String nickName;
    private String passWord;
    private String region;
    private String register;
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }



    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }
    public void setRegister(String register) {
        this.register = register;
    }
    public String getRegister() {
        return register;
    }
    public void setIdenfity(String idenfity) {
        this.idenfity = idenfity;
    }
    public String getIdenfity() {
        return idenfity;
    }


}
