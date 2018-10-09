package com.mozi.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @ClassName:Application
 * @Description: TODO
 * @author liyue
 * @date 2018年6月13日上午10:20:36
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.mozi.mybatis.*"})
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}