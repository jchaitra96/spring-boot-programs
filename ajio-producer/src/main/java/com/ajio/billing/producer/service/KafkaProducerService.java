package com.ajio.billing.producer.service;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService 
{
 @Autowired
 KafkaTemplate<String, String> kafkaTemplate;
 
 public void publishMessage(String _topic, String _message)
 {
	 ProducerRecord<String, String> producerRecord =new ProducerRecord<String, String>(_topic, null, _message);
	 kafkaTemplate.send(producerRecord);
 }
}
