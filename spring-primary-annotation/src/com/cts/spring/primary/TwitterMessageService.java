package com.cts.spring.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class TwitterMessageService implements MessageService {
	public void sendMsg()
	{
		System.out.println("TwitterMessageService implementation here");
	}
}
