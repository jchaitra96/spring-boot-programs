package com.ajio.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService 
{
	@KafkaListener(topics = "billing-confirmed", groupId = "CG1")
	public void customer(ConsumerRecord<String, String> record)
	{
		String message=record.value();
		System.out.println("message reciced" + message);
	}

}
