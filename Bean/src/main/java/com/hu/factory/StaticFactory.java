package com.hu.factory;


import com.hu.ioc.UserDao;
import com.hu.ioc.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        System.out.println("jing");
        return  new UserDaoImpl();
    }


}
