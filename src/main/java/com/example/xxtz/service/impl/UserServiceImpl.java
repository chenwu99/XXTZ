package com.example.xxtz.service.impl;

import com.example.xxtz.dao.ReceiverDao;
import com.example.xxtz.dao.SenderDao;
import com.example.xxtz.domain.Receiver;
import com.example.xxtz.domain.Sender;
import com.example.xxtz.exception.GlobalException;
import com.example.xxtz.result.CodeMsg;
import com.example.xxtz.service.UserService;
import com.example.xxtz.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ReceiverDao receiverDao;

    @Autowired
    private SenderDao senderDao;

    public Boolean login(LoginVo loginVo) {
        if (loginVo == null) {
            throw new GlobalException(CodeMsg.SERVER_ERROR);
        }
        String mobile = loginVo.getMobile();
        String formPass = loginVo.getPassword();
        int userTpye = loginVo.getType();
//        根据类型判断是消息接受者: 1 发送者: 2
        if(userTpye == 1){
            //判断手机号是否存在
            Receiver receiverUser = receiverDao.getByTele(mobile);
            if (receiverUser == null) {
                throw new GlobalException(CodeMsg.MOBILE_NOT_EXIST);
            }
            String dbPass = receiverUser.getPassword();
            if (!formPass.equals(dbPass)) {
                throw new GlobalException(CodeMsg.PASSWORD_ERROR);
            }
            return true;
        }
        if(userTpye == 2){
            //判断手机号是否存在
            Sender senderUser = senderDao.getByTele(mobile);
            if (senderUser == null) {
                throw new GlobalException(CodeMsg.MOBILE_NOT_EXIST);
            }
            String dbPass = senderUser.getPassword();
            if (!formPass.equals(dbPass)) {
                throw new GlobalException(CodeMsg.PASSWORD_ERROR);
            }
            return true;
        }
        return false;
    }







}
