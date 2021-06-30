package com.example.xxtz;

import com.example.xxtz.domain.Sender;
import com.example.xxtz.service.SenderService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan
@MapperScan
class XxtzApplicationTests {

    @Autowired
    private SenderService senderService;

    @Test
    public void contextLoads() {

        Sender sender = new Sender();
        sender.setPassword("123");
        sender.setDepartment("大庆");
        sender.setEmail("2529636439@qq.com");
        sender.setName("chenwu");
        sender.setPosition("肇源");
        sender.setTele("15774516134");
        senderService.insertSender(sender);
    }

}
