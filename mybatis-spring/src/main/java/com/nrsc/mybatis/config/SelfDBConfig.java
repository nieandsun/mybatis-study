package com.nrsc.mybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

/***
 * @author : Sun Chuan
 * @date : 2020/1/11
 * Description :
 */
@EnableTransactionManagement//开启事务
@MapperScan(basePackages = "com.nrsc.mybatis.mapper") //指定Mapper接口的地址
@ComponentScan("com.nrsc.mybatis")
public class SelfDBConfig {

    //创建数据源
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mybatis-study?characterEncoding=utf-8&serverTimezone=GMT&useSSL=false");
        return dataSource;
    }

    //注册事务管理器
    @Bean("platformTransactionManager")
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    //配置SqlSession工厂
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        //指定数据源
        factoryBean.setDataSource(dataSource());
        //指定所有mapper.xml所在路径
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:mysql/selfdbmapper/*.xml"));
        return factoryBean;
    }
}
