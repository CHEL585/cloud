package com.gul.user.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @GetMapping
    public Map<String,String> getUserInfo(){
        Map<String,String> map=new HashMap();
        map.put("userName","Gul");
        map.put("email","111111@qq.com");
        return map;
    }
}
