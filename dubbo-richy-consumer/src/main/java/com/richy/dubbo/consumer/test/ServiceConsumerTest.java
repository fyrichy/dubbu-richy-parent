package com.richy.dubbo.consumer.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.richy.dubbo.api.interfaces.DemoService;
import com.richy.dubbo.consumer.service.ConsumerService;

/**
 * @descr：测试服务消费
 * @author： Richy
 * @time：下午7:11:21
 */
public class ServiceConsumerTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
		ConsumerService consumerService = (ConsumerService)ac.getBean("consumerService");
		consumerService.pringInfo();
	}
}
