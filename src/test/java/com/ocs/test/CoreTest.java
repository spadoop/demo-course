package com.ocs.test;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ocs.ms.Application;
import com.ocs.ms.utils.Utils;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class CoreTest {

	@Test
	public void test1(){
		System.out.println(Utils.sayHello("JoeYee"));
	}
}
