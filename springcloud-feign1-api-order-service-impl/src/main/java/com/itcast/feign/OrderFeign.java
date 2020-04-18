package com.itcast.feign;

import com.itcast.fallback.OrderFallBack;
import com.itcast.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author XHW
 * @date 2020/4/17 - 23:25
 */
@FeignClient(value = "app-itcast-member",fallback = OrderFallBack.class)
public interface OrderFeign extends IMemberService{
}
