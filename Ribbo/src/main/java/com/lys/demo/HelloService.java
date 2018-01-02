package com.lys.demo;/**
 * Created by Administrator on 2017/12/30.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 廖永生
 * @create 2017-12-30 18:23
 * @decription
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {

        return restTemplate.getForObject("http://service-user/hi?name="+name,String.class);
    }

    public String doService(String what) {
        return restTemplate.getForObject("http://service-user/do?what="+what,String.class);
    }

}
