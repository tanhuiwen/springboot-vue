package com.sue.springbootvue.config;

import org.hibernate.dialect.MySQL55Dialect;
import org.springframework.context.annotation.Configuration;

/**
 * 在JPA建表时设置表的引擎为InnoDB，编码为utf-8
 */
@Configuration
public class MysqlConfig extends MySQL55Dialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
