package com.yuzf.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PeopleConfig.class)
public class PeopleTest {

	
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	
	@Autowired
	private People people;
	
//	@Autowired
//	private Man man;
	
	@Test
	public void test() {
		assertNotNull(people);
//		people.play();
	}
	
	/*@Test
	public void test2() {
		man.play();
		assertEquals("james harden!!!", log.getLog());
	}*/
}
