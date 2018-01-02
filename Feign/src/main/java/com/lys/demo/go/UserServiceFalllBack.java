package com.lys.demo.go;

import org.apache.catalina.User;

/**
 * @author 廖永生
 * @create 2017-12-30 21:21
 * @decription
 */
public class UserServiceFalllBack implements UserService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "say "+name+" fail!";
    }

    @Override
    public String doWhatFromClientOne(String what) {
        return "do "+what +" fial!";
    }
}
