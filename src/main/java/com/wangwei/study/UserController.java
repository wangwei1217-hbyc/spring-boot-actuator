package com.wangwei.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangwei on 2018/4/5.
 */
@RestController
public class UserController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
