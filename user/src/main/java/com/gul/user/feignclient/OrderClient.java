package com.gul.user.feignclient;

import com.gul.common.dto.OrderDto;
import com.gul.common.remote.order;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

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
