package com.richy.dubbo.consumer.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.richy.dubbo.api.interfaces.DemoService;

/**
 * @descr：测试服务消费
 * @author： Richy
 * @time：下午7:11:21
 */
public class ServiceConsumerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
		ac.start();
		DemoService demoService = (DemoService)ac.getBean("demoService");
		System.out.println("开始消费");
		demoService.sayHello();
	}
}
