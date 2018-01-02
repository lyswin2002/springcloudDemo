package com.lys.user.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * @author 廖永生
 * @create 2017-12-31 10:49
 * @decription
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @RequestMapping("/info")
    @ResponseBody
    Map<String,Object> getUserInfo(@RequestParam("id")int id){
        logger.info("getUserInfo----------------------");
        Map<String,Object> user = new HashMap<>();
        user.put("id",id);
        user.put("name","lys");
        return user;
    }
}
