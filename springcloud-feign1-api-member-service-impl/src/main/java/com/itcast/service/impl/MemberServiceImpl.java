package com.itcast.service.impl;

import com.itcast.base.BaseApiService;
import com.itcast.base.ResponseBase;
import com.itcast.entity.User;
import com.itcast.service.IMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XHW
 * @date 2020/4/17 - 23:09
 */

@RestController
public class MemberServiceImpl extends BaseApiService implements IMemberService{


    @RequestMapping("/getMember")
    public User getMember(@RequestParam("name") String name) {
        User user = new User();
        user.setName(name);
        user.setAge(22);
        return user;
    }

    @RequestMapping("/getUserInfo")
    public ResponseBase getUserInfo() {
        System.out.println("getUserInfo......");
        try {
            Thread.sleep(1500);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return setResultSuccess("会员端口被调用");
    }
}
