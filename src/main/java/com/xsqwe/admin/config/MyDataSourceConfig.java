package com.xsqwe.admin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @description: todo
 * @author: gaojiabao
 * @date: 2021/2/6 22:58
 */
//@Configuration
    @Deprecated
public class MyDataSourceConfig {

//    @Bean
    // 默认的自动配置是判断容器没有才会配置@ConditionalOnMissingBean (DataSource.class)
//    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setFilters("stat"); // 加入监控功能
        return dataSource;
    }

    /**
     * 配置druid 的监控页功能
     * @return
     */
//    @Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet,"/druid/*");
        registrationBean.addInitParameter("loginUsername","admin");
        registrationBean.addInitParameter("loginPassword","12345");
        return registrationBean;
}

}
