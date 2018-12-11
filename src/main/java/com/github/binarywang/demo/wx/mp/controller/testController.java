package com.github.binarywang.demo.wx.mp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.binarywang.demo.wx.mp.entity.HaloLogs;
import com.github.binarywang.demo.wx.mp.mapper.HaloLogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {

    @Autowired
    HaloLogsMapper haloLogsMapper;

    @GetMapping("/test")
    public String test() {
        System.out.print("helloWord111");
        List<HaloLogs> haloLogs = haloLogsMapper.selectList(new QueryWrapper<>());
        haloLogs.forEach((HaloLogs s) -> System.out.print(s.toString()));
        return haloLogsMapper.selectList(new QueryWrapper<>()).toString();
    }
}
