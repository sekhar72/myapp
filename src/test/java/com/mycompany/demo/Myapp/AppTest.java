package com.mycompany.demo.Myapp;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {
	App app = new App();

	@Test
	public void validateSetAndGet() {
		app.setGreeting("good afternoon");
		Assert.assertEquals("good afternoon", app.getGreeting());

	}
}