package com.lr.alterui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liurui
 * @date 2019/11/18 21:14
 */
@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hello() {
        return "hi";
    }
}
