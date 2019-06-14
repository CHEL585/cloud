package com.gul.common.remote;

import com.gul.common.dto.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * </p>
 *
 * @author Gul
 * @version 1.0.0
 * @since JDK 1.8
 */

public interface order {
    @GetMapping(path = "{id}")
    OrderDto orderDetail(@PathVariable("id") String orderId);
}
