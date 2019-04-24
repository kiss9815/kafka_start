package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic = "makeshop-product-topic";
//	String kafkaTopic = "hi-topic";
	//카프카 프로듀셔	
	public void send(String message) {
	    
		System.out.println("message="+message);
	    
	    
	    kafkaTemplate.send(kafkaTopic, message);
	}

}
