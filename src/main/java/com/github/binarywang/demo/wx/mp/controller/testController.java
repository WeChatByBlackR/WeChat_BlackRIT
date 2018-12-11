package com.github.binarywang.demo.wx.mp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.binarywang.demo.wx.mp.entity.HaloLogs;
import com.github.binarywang.demo.wx.mp.mapper.HaloLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {

    @Autowired
    HaloLogsService haloLogsService;

    @GetMapping("/test")
    public List<HaloLogs> test() {
        System.out.print("helloWord111");
        return haloLogsService.selectList(new QueryWrapper<>());
    }
}
