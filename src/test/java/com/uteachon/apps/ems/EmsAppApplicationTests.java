package com.uteachon.apps.ems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmsAppApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Triggering EmsAppApplicationTests ");
		Assertions.assertEquals(true, true);
	}

}
