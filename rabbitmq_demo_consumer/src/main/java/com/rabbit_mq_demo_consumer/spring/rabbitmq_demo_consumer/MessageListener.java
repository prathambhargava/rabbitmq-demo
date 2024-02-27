package com.rabbit_mq_demo_consumer.spring.rabbitmq_demo_consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
public class MessageListener {

	@RabbitListener(queues = MQConfig.QUEUE)
	public void listner(CustomMessage message) {
		System.out.println(message);
	}
}
