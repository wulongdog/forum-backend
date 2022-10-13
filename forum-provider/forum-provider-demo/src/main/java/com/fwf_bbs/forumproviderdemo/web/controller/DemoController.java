package com.fwf_bbs.forumproviderdemo.web.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className DemoController
 * @description demo controller类 对外接口
 * @auther wulongdog
 * @date 2022/10/7  22:22
 */
@RefreshScope
@RestController
public class DemoController {

    @RequestMapping("/test")
    public String demoTest(){
        return "hello world";
    }

    @Value("${config.info}")
    public String config;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return config;
    }
}
