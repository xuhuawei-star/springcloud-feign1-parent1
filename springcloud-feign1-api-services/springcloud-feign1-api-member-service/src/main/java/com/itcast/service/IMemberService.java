package com.itcast.service;

import com.itcast.base.ResponseBase;
import com.itcast.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author XHW
 * @date 2020/4/17 - 18:42
 */
public interface IMemberService {

    @RequestMapping("/getMember")
    public User getMember(@RequestParam("name") String name);

    @RequestMapping("/getUserInfo")
    public ResponseBase getUserInfo();

}
