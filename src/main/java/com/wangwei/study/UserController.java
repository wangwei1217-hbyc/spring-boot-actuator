package com.wangwei.study;

import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wangwei on 2018/4/5.
 */
@RestController
public class UserController {

    @Resource
    private CounterService counterService;
    @Resource
    private GaugeService gaugeService;

    @GetMapping("/home")
    public String home(@RequestParam("flag") String flag){
        counterService.increment("user.home.count");
        if("false".equals(flag)){
            throw new RuntimeException("home error");
        }
        return "home";
    }

    @GetMapping("/price")
    public String price(@RequestParam("price") Double price){
        gaugeService.submit("product.price",price);
        return "price";
    }
}
