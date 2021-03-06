package cn.iocoder.mall.promotion.biz.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("cn.iocoder.mall.promotion.biz.dao") // 扫描对应的 Mapper 接口
@EnableTransactionManagement(proxyTargetClass = true) // 启动事务管理。为什么使用 proxyTargetClass 参数，参见 https://blog.csdn.net/huang_550/article/details/76492600
public class DatabaseConfiguration {

    // 数据源，使用 HikariCP

}