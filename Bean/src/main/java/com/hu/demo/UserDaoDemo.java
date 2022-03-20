package com.hu.demo;

import com.hu.ioc.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= (UserDao) app.getBean("UserDao");
        System.out.println(userDao);
        userDao.say();
    }
}
