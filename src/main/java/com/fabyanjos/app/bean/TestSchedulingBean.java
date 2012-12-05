package com.fabyanjos.app.bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSchedulingBean {
	
	@Scheduled(fixedDelay = 1000)
	public void print() {
		System.out.println("Ola!");
	}

}
