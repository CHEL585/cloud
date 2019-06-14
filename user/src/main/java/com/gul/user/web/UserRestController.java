package com.gul.user.web;

import com.gul.common.dto.OrderDto;
import com.gul.user.feignclient.OrderClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * </p>
 *
 * @author Gul
 * @version 1.0.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("user")
public class UserRestController {
    @Autowired
    private OrderClient orderClient;

    @GetMapping
    public Map<String,String> getUserInfo(){
        Map<String,String> map=new HashMap();
        map.put("userName","Gul");
        map.put("email","111111@qq.com");
        return map;
    }

    @GetMapping(value = "cmd",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @HystrixCommand
    public Map<String,String> getUser(){
        Map<String,String> map=new HashMap();
        map.put("userName","Gul");
        return map;
    }

    @GetMapping(path = "{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public OrderDto orderDetail(@PathVariable("id") String id){
        return orderClient.orderDetail(id);
    }
}
