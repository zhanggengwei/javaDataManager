package com.reflect.Tools;

/**
 * Created by vd on 2017/3/26.
 */
public class ReflectDemo {
    //动态获取类中的信息  java的反射机制
    //可以理解为对类的解剖
    //字节码文件解剖，获取字节码对象的方式
    // 1.getClass();
    // 2 .class 任何一个对象都具有静态的方法
    // 3只要指定类的名称，可以获得该类，更为扩展
    // 通过字节码文件获得类中的方法

    String personClassName = "com.reflect.Tools.Person";

    private void method() throws ClassNotFoundException
    {
         Class clazz = Class.forName(personClassName);

    }


}
