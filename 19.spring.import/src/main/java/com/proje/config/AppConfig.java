package com.proje.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.proje.bean.BeanConfig;
import com.proje.database.DatabaseConfig;

@Configuration
@Import({
	DatabaseConfig.class, BeanConfig.class
})
public class AppConfig {

}
