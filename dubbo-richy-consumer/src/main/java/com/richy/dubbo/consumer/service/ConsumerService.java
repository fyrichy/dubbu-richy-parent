package com.richy.dubbo.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.richy.dubbo.api.interfaces.DemoService;

/**
 * @descr：通过在ConsumserService中调用DemoService
 * @author： Richy
 * @time：下午8:49:36
 */
@Service
public class ConsumerService {
	
	@Autowired
	private DemoService demoService;
	
	public void pringInfo() {
		System.out.println("进行调用了..........");
		demoService.sayHello();
	}

}
