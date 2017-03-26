package com.reflect.Tools;

/**
 * Created by vd on 2017/3/26.
 */
public class Person {

    private Integer age;
    private String  name;
    private String  sex;
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    private static void method()
    {
        System.out.println("private static void method");
    }



}
