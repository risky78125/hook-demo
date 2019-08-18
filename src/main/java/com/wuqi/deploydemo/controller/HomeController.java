package com.wuqi.deploydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * 创建人: 武奇
 * 创建事件: 2019/8/18
 */
@RestController
public class HomeController {

    @GetMapping({"/", "/home", "/index"})
    public Map home() {
        return Collections.singletonMap("message", "home");
    }

}
