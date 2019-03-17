package com.richy.dubbo.provider.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoServiceProvider {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("provider.xml");
		cpac.start();
		System.in.read();
	}
}
