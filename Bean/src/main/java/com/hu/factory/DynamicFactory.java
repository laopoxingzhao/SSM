package com.hu.factory;

import com.hu.ioc.UserDao;
import com.hu.ioc.UserDaoImpl;

public class DynamicFactory {


    public  UserDao getUserDao(){
        System.out.println("dong");
        return  new UserDaoImpl();
    }
}
