package com.example.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

//	
	
	//카프카 컨슈머
//	@KafkaListener(topics = {"hi-topic"})
	public void getKafkaTopic(ConsumerRecord<String, String> consumerRecord) {
		System.out.println("getKafkaTopic11==>>{}" + consumerRecord.toString()); 
		
		String kafkavalue =  consumerRecord.value();
		
		System.out.println("kavalue==>>{} , {}" + kafkavalue );
		
	}
	
	
}
