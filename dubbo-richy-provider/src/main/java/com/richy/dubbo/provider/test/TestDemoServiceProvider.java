package com.richy.dubbo.provider.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemoServiceProvider {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("provider.xml");
		cpac.start();
		System.out.println("服务提供者启动服务......");
		System.in.read();
	}
}
