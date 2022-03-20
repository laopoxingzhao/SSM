package com.hu.proxy.jdk;

public class Advice {
    public void before(){
        System.out.println("be");
    }
    public  void  after(){
        System.out.println("after");
    }

}
