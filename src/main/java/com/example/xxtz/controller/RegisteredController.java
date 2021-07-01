package com.example.xxtz.controller;


import com.example.xxtz.result.Result;
import com.example.xxtz.service.UserService;
import com.example.xxtz.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/Registered")
public class RegisteredController {

//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/do_registered")
//    @ResponseBody
//    public Result<String> doRegistered(@Valid LoginVo loginVo){
//        log.info(loginVo.toString());
//        userService.login(loginVo);
//        return Result.success(null);
//    }

}
