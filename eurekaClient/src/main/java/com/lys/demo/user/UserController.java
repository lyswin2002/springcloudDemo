package com.lys.demo.user;/**
 * Created by Administrator on 2017/12/23.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @ResponseBody
    @RequestMapping(value = "/")
    String location() {
        return "来北京"+counter.incrementAndGet()+"次了！";
    }
}
