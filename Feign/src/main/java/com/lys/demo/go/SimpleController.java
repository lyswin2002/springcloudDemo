package com.lys.demo.go;/**
 * Created by Administrator on 2017/12/30.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 廖永生
 * @create 2017-12-30 17:21
 * @decription
 */
@Controller
public class SimpleController {

    @Autowired
    UserService userService;

    @RequestMapping("/w")
    @ResponseBody
    Map<String, Object> whatAreYouDoing(@RequestParam("name")String name,@RequestParam("what")String what){
        Map<String,Object> result = new HashMap();
        result.put("hi",userService.sayHiFromClientOne(name));
        result.put("do",userService.doWhatFromClientOne(what));
        return result;
    }
}
