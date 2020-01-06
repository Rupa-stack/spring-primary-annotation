package com.cts.spring.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailMessageService implements MessageService {
	public void sendMsg()
	{
		System.out.println("EmailMessageService implementation here");
	}
}
