package com.example.DevSecOps;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevSecOpsApplicationTests {

	@Test
	void contextLoads() {
		car car = new car("AA11BB", "ferrari", 2000);
		String plate = car.getPlateNumber();

		assertEquals("AA11BB", plate);

	}

}
