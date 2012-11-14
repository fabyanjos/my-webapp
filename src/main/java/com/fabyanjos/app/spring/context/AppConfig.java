package com.fabyanjos.app.spring.context;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.fabyanjos.app.spring.TransactionConfig;

@Configuration
@ComponentScan(value="com.fabyanjos.app",excludeFilters=@ComponentScan.Filter(Configuration.class))
@Import({TransactionConfig.class})
public class AppConfig {

}
