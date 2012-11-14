package com.fabyanjos.app.jersey;

import javax.ws.rs.ApplicationPath;

import com.sun.jersey.api.core.PackagesResourceConfig;

@ApplicationPath("rest")
public class MyApplication extends PackagesResourceConfig {
	public MyApplication() {
		super("com.fabyanjos.app.rest");
	}
}
