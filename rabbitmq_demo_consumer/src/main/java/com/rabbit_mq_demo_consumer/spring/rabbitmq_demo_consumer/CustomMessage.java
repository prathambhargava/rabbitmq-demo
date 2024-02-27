package com.rabbit_mq_demo_consumer.spring.rabbitmq_demo_consumer;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage {

	private String messageId;
	private String message;
	private Date messageDate;

}
