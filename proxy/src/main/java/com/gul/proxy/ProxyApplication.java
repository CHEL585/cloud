package com.gul.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ProxyApplication {

	public static void main(String[] args) {
		//prod
		//dev
        //dev1
		//dev2
		//dev3
		//dev4
		SpringApplication.run(ProxyApplication.class, args);
	}

}
