package com.example.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class HelloworldApplicationTests {

	@Test
	public void userHome() {
		System.out.println("user.home=" + System.getProperty("user.home"));
	}
}
