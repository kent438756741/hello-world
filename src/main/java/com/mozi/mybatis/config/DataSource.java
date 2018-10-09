package com.mozi.mybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 
 * @ClassName:DataSource
 * @Description: 数据源
 * @author liyue
 * @date 2018年6月13日上午9:56:39
 */
@Configuration
@MapperScan(basePackages={"com.mozi.mybatis.mapper"}, sqlSessionTemplateRef="sqlSessionTemplate")
public class DataSource {
	
	@Autowired
	private DataSourceConfig dataSourceConfig;

	@Bean("primaryDataSource")
	public DruidDataSource primaryDataSource() {
    	DruidDataSource druidDataSource = new DruidDataSource();
    	druidDataSource.setUrl(dataSourceConfig.getUrl());
    	druidDataSource.setUsername(dataSourceConfig.getUsername());
    	druidDataSource.setPassword(dataSourceConfig.getPassword());
    	return druidDataSource;
    }
    
    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(primaryDataSource());
        return factoryBean.getObject();
    }
    
    @Bean("sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory());
        return template;
    }
    
}
