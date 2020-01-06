package com.cts.spring.primary;

import org.springframework.stereotype.Component;

@Component
public class FacebookMessageService implements MessageService{
	public void sendMsg()
	{
		System.out.println("FacebookMessageService implementation here");
	}
}
