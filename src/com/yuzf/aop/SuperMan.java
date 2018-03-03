package com.yuzf.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SuperMan {
	
	@Before(value = "execution(* com.yuzf.aop.User.*(..))")
	public void before() {
		System.out.println("before!!!");
	}
}
