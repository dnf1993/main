package com.zhouwen.main.get.controller;

import com.zhouwen.main.get.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName Test
 * @Description
 * @Author CZZTECH
 * @DateTime 2018/8/20 15:55
 */
@RestController
@RequestMapping("test")
public class Test {

    @Autowired
    TestService testService;

    @RequestMapping("test1")
    @ResponseBody
    public String teset(){
        testService.selectOneRecord();
        HashMap map = new HashMap();
        return "112323";
    }


}
