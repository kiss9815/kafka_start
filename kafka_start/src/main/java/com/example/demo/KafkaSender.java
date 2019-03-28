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
	
	String kafkaTopic = "javainuse-topic";
	//kafka 가 프로듀서의 topic 과 일치 해야함
	//.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javainuse-topic --from-beginning
	
	//카프카 프로듀셔
	public void send(String message) {
	    
		System.out.println("message="+message);
	    
	    
	    kafkaTemplate.send(kafkaTopic, message);
	}

}
