package com.gul.order.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("order")
public class OrderRestController {
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
}
