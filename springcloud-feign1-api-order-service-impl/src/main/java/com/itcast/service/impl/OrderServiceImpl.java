package com.itcast.service.impl;

import com.itcast.base.BaseApiService;
import com.itcast.base.ResponseBase;
import com.itcast.entity.User;
import com.itcast.feign.OrderFeign;
import com.itcast.service.IOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XHW
 * @date 2020/4/17 - 23:24
 */
@RestController
public class OrderServiceImpl extends BaseApiService implements IOrderService{

    @Autowired
    private OrderFeign feign;

    @RequestMapping("/getOrder")
    public String getOrder(String name) {
        User user = feign.getMember(name);
        return "订单调用会员接口：" + user.toString();
    }

    @RequestMapping("/orderToMember")
    public ResponseBase orderToMember() {
        ResponseBase responseBase = feign.getUserInfo();
        return responseBase;
    }

    @RequestMapping("/orderToMemberHystrix")
    @HystrixCommand(fallbackMethod = "orderToMemberHystrixFallback")
    public ResponseBase orderToMemberHystrix() {
        System.out.println("orderToMemberHystrix......");
        ResponseBase responseBase = feign.getUserInfo();
        return responseBase;
    }

    public ResponseBase orderToMemberHystrixFallback() {
        System.out.println("解决雪崩效应线程池名称：" + Thread.currentThread().getName());
        ResponseBase responseBase = feign.getUserInfo();
        return responseBase;
    }

    @RequestMapping("/orderInfo")
    public ResponseBase orderInfo() {
        System.out.println("未解决雪崩效应线程池名称：" + Thread.currentThread().getName());
        return setResultSuccess();
    }
}
