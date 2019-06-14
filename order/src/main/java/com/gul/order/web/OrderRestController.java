package com.gul.order.web;

import com.gul.common.dto.OrderDto;
import com.gul.common.remote.order;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
@RequestMapping("order")
public class OrderRestController implements order {
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

    @Override
    @GetMapping(path = "{id}")
    public OrderDto orderDetail(@PathVariable("id") String orderId) {
        OrderDto orderDto=OrderDto.builder().id(orderId)
                .goodsName("牛仔裤")
                .goodsNum("5")
                .time("2019-3-20")
                .xdr("admin").build();
        return orderDto;
    }
}
