package com.fabyanjos.app.spring.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.fabyanjos.app",excludeFilters=@ComponentScan.Filter(Configuration.class))
public class AppConfig {

}
