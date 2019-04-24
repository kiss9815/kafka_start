package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTest {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Test
	public void test() {
		String kafkaTopic = "makeshop-product-topic";
		System.out.println("start");
		String message = "2|xexymix4|1|xexymix|001"; // 두번째 변수는 상관없음
		message = "2|xexymix4|1|justone|001";
		kafkaTemplate.send(kafkaTopic, message);
	}
	
}
