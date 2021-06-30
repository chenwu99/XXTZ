package com.example.xxtz.service.impl;

import com.example.xxtz.dao.SenderDao;
import com.example.xxtz.domain.Sender;
import com.example.xxtz.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SenderServiceImpl implements SenderService {


    @Autowired
    private SenderDao senderDao;

    @Override
    public boolean insertSender(Sender sender) {
        senderDao.insertSender(sender);
        return true;
    }

    @Override
    public SenderDao selectSender(int senderId) {
        return null;
    }
}
