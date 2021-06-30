package com.example.xxtz.domain;

import lombok.Data;

//@Data ： 注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
@Data
public class Sender {

    private Integer senderID;

    private String name ;

    private String department;

    private String position;

    private String tele;

    private String email;

    private String password;

}
