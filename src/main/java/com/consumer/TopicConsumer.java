package com.consumer;

public class TopicConsumer {
	public void onMessage(String message) {
		System.out.println("consumor:" + message);
	}
}
