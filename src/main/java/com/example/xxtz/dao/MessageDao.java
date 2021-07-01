package com.example.xxtz.dao;


import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao {

    boolean insertMessage(MessageDao messageDao);

    MessageDao selectMessage(int messageId);

}
