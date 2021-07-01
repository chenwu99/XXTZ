package com.example.xxtz.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

@Data
public class LoginVo {

	@NotNull
	@IsMobile
	private String mobile;

	@NotNull
	private String password;

//	根据类型判断是消息接受者: 1 发送者: 2
	@NotNull
	private Integer type;


}
