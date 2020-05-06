package com.tejas.service;

import java.io.File;

/**
 * Performs routing based on item type. Will redirect to bookItemsChannel if the
 * item is of type book to musicItemsChannel if the item is of type musicCD to
 * softwareItemsChannel if the item is of type software
 * 
 * @author BruceWayne
 *
 */
public class LoanRouter {

	public String routeLoan(Customer customer) {
		String channel = "";

		if (customer.getCreditScore() >= 800)
			channel = "premiumChannel";
		else if (customer.getCreditScore() >= 700) {
			channel = "executiveChannel";
		} else
			channel = "stdChannel";
		return channel;
	}

}
