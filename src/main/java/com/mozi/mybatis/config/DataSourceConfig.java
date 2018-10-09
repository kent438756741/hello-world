package com.mozi.mybatis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName:DataSourceConfig
 * @Description: 读取数据源配置
 * @author liyue
 * @date 2018年6月13日上午9:56:53
 */
@Component
@ConfigurationProperties(prefix="spring.datasource.primary")
public class DataSourceConfig {

	private String url;
	
	private String username;
	
	private String password;
	
	private String driver;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
}
