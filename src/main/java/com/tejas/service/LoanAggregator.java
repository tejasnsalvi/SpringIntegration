package com.tejas.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 * Receives the collection of order items that have been processed for the
 * discount reduction.
 * 
 * @author BruceWayne
 *
 */
public class LoanAggregator {

	public List<Customer> prepareDelivery(List<Customer> list) {
		System.out.println("***** Loan Aggregator *****");
		list.forEach(c -> {
			System.out.println(c.getMsg());
		});

		return list;
	}
}
