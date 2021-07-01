package com.example.xxtz.service;

import com.example.xxtz.vo.LoginVo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public interface UserService {

    Boolean login(LoginVo loginVo);

//    Boolean registered(int type,)

}
