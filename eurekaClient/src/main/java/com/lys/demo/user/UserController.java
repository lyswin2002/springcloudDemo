package com.lys.demo.user;/**
 * Created by Administrator on 2017/12/23.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 廖永生
 * @create 2017-12-23 9:30
 * @decription
 */
@Controller
public class UserController {

    private AtomicLong counter = new AtomicLong();

    @Value("${server.port}")
    String from;

    @ResponseBody
    @RequestMapping(value = "/hi")
    String location(@RequestParam("name")String name) {
        return name+"来"+from+counter.incrementAndGet()+"次了！";
    }

    @ResponseBody
    @RequestMapping(value="/do")
    String doWork(@RequestParam("what")String what){
        return what+"-------------";

    }
}
