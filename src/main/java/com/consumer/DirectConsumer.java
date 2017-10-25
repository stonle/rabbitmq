package com.consumer;

public class DirectConsumer {
	public void onMessage(String message) {
		System.out.println("consumor:" + message);
	}
}
