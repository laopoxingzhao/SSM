package com.hu.Service;

import com.hu.ioc.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService{
    public UserServiceImpl() {
        System.out.println("service");
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;
    @Override
   /* public void save() {
        System.out.println("save");
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("UserDao");
        userDao.say();

    }*/
    public void save(){
        userDao.say();
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;

    }
}
