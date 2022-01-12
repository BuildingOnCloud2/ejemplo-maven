package com.devopsusach2020;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevOpsUsach2020ApplicationTests {

	@Test
	void contextLoads() {
    int a = 1;
    int b = 2;

    int result = a + b;

    //Assert.assertEquals(3, result);
  }
  @Test	
	void contextLoads2() {
    int a = 3;
    int b = 4;

    int result = a + b;

    //Assert.assertEquals(6, result);
	}
}
