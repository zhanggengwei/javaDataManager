package com.Manager.Beans;

/**
 * Created by vd on 2017/3/26.
 */
public class UserInfo
{
    public void setIdenfity(String idenfity) {
        this.idenfity = idenfity;
    }

    private String idenfity;
    private String phone;
    private String nickName;
    private String passWord;
    private String region;
    private String register;
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getIdenfity() {
        return idenfity;
    }

}
