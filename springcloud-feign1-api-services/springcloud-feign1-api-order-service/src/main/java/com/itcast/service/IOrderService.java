package com.itcast.service;

import com.itcast.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author XHW
 * @date 2020/4/17 - 22:59
 */
public interface IOrderService {

    @RequestMapping("/getOrder")
    public String getOrder(String name);

    @RequestMapping("/orderToMember")
    public ResponseBase orderToMember();

    @RequestMapping("/orderInfo")
    public ResponseBase orderInfo();

}
