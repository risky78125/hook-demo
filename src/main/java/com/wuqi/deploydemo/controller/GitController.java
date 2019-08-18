package com.wuqi.deploydemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * 创建人: 武奇
 * 创建事件: 2019/8/18
 */
@RestController
@RequestMapping("/git")
@Slf4j
public class GitController {

    @PostMapping("/hook")
    public Map hook(@RequestBody Map body) {
        log.info("git hook info: {}", body);
        return Collections.singletonMap("message", "ok");
    }

}
