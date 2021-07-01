package com.example.xxtz;

import com.example.xxtz.domain.Sender;
import com.example.xxtz.service.SenderService;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");

    public static boolean isMobile(String src) {
        if(StringUtils.isEmpty(src)) {
            return false;
        }
        Matcher m = mobile_pattern.matcher(src);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(isMobile("19123412345ig"));
        System.out.println(isMobile("25774516134"));
    }

    @Test
    public void ismobile() {

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
