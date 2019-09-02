package com.mye.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", method = RequestMethod.GET)
@Api(value = "helloController相关操作", description = "登陆信息")
public class HelloController {
    @RequestMapping(value = "/get")
    @ApiOperation(value = "登陆")
    public String hello(@RequestParam Integer userNumber) {
        if(userNumber == 1)
            return "Hello,1";
        else if(userNumber == 2)
            return "Hello,2";
        else if (userNumber == 3)
            return "Hello,3";
        else
            return "Hello,DK";
    }
}
