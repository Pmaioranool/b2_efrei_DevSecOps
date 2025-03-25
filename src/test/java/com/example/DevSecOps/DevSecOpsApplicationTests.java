package com.example.DevSecOps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevSecOpsApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car("AA11BB", "ferrari", 2000);
		String plate = car.getPlateNumber();

		assertEquals("AA11BB", plate);
	}

}
