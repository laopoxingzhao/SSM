package com.hu.ioc;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("user");
    }
    public  void init(){
        System.out.println("init");
    }
    public void destory(){
        System.out.println("destory");
    }
    @Override
    public void say() {
        System.out.println("哈哈ss哈");
    }
}
