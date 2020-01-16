package com.nrsc.study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/***
 * nrsc-mybatis数据库对应的配置
 *
 * 指定Mapper接口的地址,并指定使用的SqlSessionFactory,可以联系上篇文章思考一下这里的sqlSessionFactoryRef的作用
 */
@MapperScan(basePackages = "com.nrsc.study.mapper.nrsc", sqlSessionFactoryRef = "nrscMybatisSqlSessionFactory")
@Configuration
public class NrscMybatisConfig {

    //创建数据源
    @Bean("nrscMybatisDataSource")
    //以nrsc.datasource开头的属性都会set到new DruidDataSource()中
    @ConfigurationProperties(prefix = "nrsc.datasource")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

    //注册事务管理器
    @Bean("nrscMybatisPlatformTransactionManager")
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    //配置SqlSession工厂
    @Bean("nrscMybatisSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        //指定数据源
        factoryBean.setDataSource(dataSource());
        //指定所有mapper.xml所在路径
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/nrsc-mybatis/*.xml"));
        return factoryBean.getObject();
    }
}
