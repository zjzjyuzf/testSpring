package com.yuzf.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SuperMan implements Man{

	private People people;

	@Autowired
	public SuperMan(People people) {
		this.people = people;
	}
	
	public void play() {
		people.play();
	}
	
	
}
