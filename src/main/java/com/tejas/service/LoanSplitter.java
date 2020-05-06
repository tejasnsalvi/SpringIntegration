package com.tejas.service;

import java.io.File;
import java.util.List;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

/**
 * Splits an Order into it's constituent OrderItems
 * 
 * @author BruceWayne
 *
 */
public class LoanSplitter extends AbstractMessageSplitter{

	@Override
	protected Object splitMessage(Message<?> message) {
		List<Customer> list = (List<Customer>) message.getPayload();
		return list;
	}

}
