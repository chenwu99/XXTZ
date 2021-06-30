package com.example.xxtz.service;

import com.example.xxtz.dao.SenderDao;
import com.example.xxtz.domain.Sender;

public interface SenderService {

    boolean insertSender(Sender sender);

    SenderDao selectSender(int senderId);
}
