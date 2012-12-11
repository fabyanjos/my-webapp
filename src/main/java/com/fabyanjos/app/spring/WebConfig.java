package com.fabyanjos.app.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fabyanjos.app.gson.GSONHttpMessageConverter;

@Configuration
@EnableWebMvc
@ComponentScan("com.fabyanjos.app.rest")
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Autowired private GSONHttpMessageConverter converter;
	
	@Bean public Jaxb2RootElementHttpMessageConverter xmlConverter() {
		return new Jaxb2RootElementHttpMessageConverter();
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(converter);
		converters.add(xmlConverter());
		super.configureMessageConverters(converters);
	}

}
