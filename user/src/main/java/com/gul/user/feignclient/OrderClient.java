package com.gul.user.feignclient;


import com.gul.common.remote.order;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * <p>
 * </p>
 *
 * @author Gul
 * @version 1.0.0
 * @since JDK 1.8
 */
@FeignClient(name = "order",path = "/order")
public interface OrderClient extends order {

}
