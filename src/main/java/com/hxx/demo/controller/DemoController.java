package com.hxx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <ul>
 * <li>功能说明：简单 rest 示例</li>
 * <li>作者：Tal on 2021\6\20 0020 21:11 </li>
 * </ul>
 */
@RestController()
public class DemoController {

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello," + name;
    }
}
