package com.example.DevSecOps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevSecOpsApplicationTests {

	@Test
	void contextLoads() {
		Chicken Chicken = new Chicken("jockey", "none", 2000);
		String Name = Chicken.getName();

		assertEquals("jockey", Name);
	}

}
