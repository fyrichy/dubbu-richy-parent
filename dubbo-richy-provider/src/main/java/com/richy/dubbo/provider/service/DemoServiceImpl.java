package com.richy.dubbo.provider.service;

import com.richy.dubbo.api.interfaces.DemoService;

/**
 * @descr：demoService的实现类
 * @author： Richy
 * @time：下午6:35:51
 */
public class DemoServiceImpl implements DemoService{

	@Override
	public void sayHello() {
		System.out.println("Welcome To Study Dubbo......");
	}

}
