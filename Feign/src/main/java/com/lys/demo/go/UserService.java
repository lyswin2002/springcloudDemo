package com.lys.demo.go;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用user服务模块
 * Created by Administrator on 2017/12/30.
 */

@FeignClient(value="service-user",fallback = UserServiceFalllBack.class)
public interface UserService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value="/do",method = RequestMethod.GET)
    String doWhatFromClientOne(@RequestParam("what")String what);

}
