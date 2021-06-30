package com.example.xxtz.dao;


import org.springframework.stereotype.Repository;

@Repository
public interface Message {

    boolean insertMessage(Message message);

    Message selectMessage(int messageId);

}
