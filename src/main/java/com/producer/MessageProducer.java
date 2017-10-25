package com.producer;

import java.io.IOException;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MessageProducer {
	 @Autowired
	 private AmqpTemplate rabTemplate;
	
	 public void sendMessage(Object message) throws IOException {  
		 rabTemplate.convertAndSend("funoutTest", message);  
		 
		 rabTemplate.convertAndSend("directTest", message);
		 
		 rabTemplate.convertAndSend("topicTest", message);
	 }  
}
