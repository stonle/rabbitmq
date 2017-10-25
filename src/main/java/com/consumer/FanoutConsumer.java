package com.consumer;

public class FanoutConsumer {
	public void onMessage(String message) {
		System.out.println("consumor:" + message);
	}
}
