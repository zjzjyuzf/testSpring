package com.yuzf.spring;

import org.springframework.stereotype.Component;

@Component
public class User implements People{

	@Override
	public void play() {
		System.out.print("james harden!!!");
	}

}
