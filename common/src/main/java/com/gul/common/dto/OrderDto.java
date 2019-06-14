package com.gul.common.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * </p>
 *
 * @author Gul
 * @version 1.0.0
 * @since JDK 1.8
 */
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderDto {

    private String id;

    private String goodsName;

    private String goodsNum;

    private String xdr;

    private String time;
}
