package com.lys.demo;/**
 * Created by Administrator on 2017/12/30.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

/**
 * @author 廖永生
 * @create 2017-12-30 18:21
 * @decription
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/w")
    Map<String, Object> hi(@RequestParam("name")String name,@RequestParam("what")String what){
        Map<String,Object> result = new HashMap();
        result.put("hi",helloService.hiService(name));
      //  result.put("do",helloService.doService(what));
        return result;
    }
}
