package com.itcast.fallback;

import com.itcast.base.BaseApiService;
import com.itcast.base.ResponseBase;
import com.itcast.entity.User;
import com.itcast.feign.OrderFeign;
import org.springframework.stereotype.Component;

/**
 * @author XHW
 * @date 2020/4/17 - 23:27
 */
@Component
public class OrderFallBack extends BaseApiService implements OrderFeign {
    @Override
    public User getMember(String name) {
        return null;
    }

    @Override
    public ResponseBase getUserInfo() {
        return setResultError("服务器繁忙，请稍后重试，以类的方式进行服务降级");
    }
}
