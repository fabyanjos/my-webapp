package com.fabyanjos.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.fabyanjos.app.model.Item;
import com.fabyanjos.app.service.ItemService;

public class WebAppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext context) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.scan("com.fabyanjos.app.spring.context");
		appContext.refresh();
		appContext.setServletContext(context);
		System.out.println(appContext.getBean(ItemService.class));
		
	}

}
