package com.shunvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author shunvs
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ShunvsApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(ShunvsApplication.class, args);
		System.out.println("上大微信小程序后台管理系统启动成功");
	}

}
