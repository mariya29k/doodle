package com.example.doodle_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.ibm.db2.jcc.DB2Driver");
        dataSource.setUrl("jdbc:db2://62.44.108.24:50000/SAMPLE");
        dataSource.setSchema("FN71996");
        dataSource.setUsername("db2admin");
        dataSource.setPassword("db2admin");

        return dataSource;
    }
}
