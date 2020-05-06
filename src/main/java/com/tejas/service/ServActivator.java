package com.tejas.service;

import java.io.File;
import java.time.LocalDate;

/**
 * Class invoked by ServiceActivator Performs the price reductions for all item
 * types.
 * 
 * @author BruceWayne
 *
 */
public class ServActivator {

	public Customer processPremium(Customer customer) {
		System.out.println("***** Premium ServActivator *****");
		Long amt = customer.getLoanAmount() / 100000L;
		customer.setMsg(getFinalMsg(amt.toString(), customer.getName(), "6.5%", ""));
		return customer;
	}

	public Customer processExecutive(Customer customer) {
		System.out.println("***** Executive ServActivator *****");
		Long amt;
		if (customer.getLoanAmount() > 5100000L) {
			customer.setLoanAmount(5000000L);
			amt = customer.getLoanAmount() / 100000L;
			customer.setMsg(
					getFinalMsg(amt.toString(), customer.getName(), "7%", " Since your credit score is below 800"));
		} else {
			amt = customer.getLoanAmount() / 100000L;
			customer.setMsg(getFinalMsg(amt.toString(), customer.getName(), "7%", ""));
		}
		return customer;
	}

	public Customer processStd(Customer customer) {
		System.out.println("***** Std ServActivator *****");
		Long amt;
		if (customer.getLoanAmount() > 2600000L) {
			customer.setLoanAmount(2500000L);
			amt = customer.getLoanAmount() / 100000L;
			customer.setMsg(
					getFinalMsg(amt.toString(), customer.getName(), "7.5%", " Since your credit score is below 700"));
		} else {
			amt = customer.getLoanAmount() / 100000L;
			customer.setMsg(getFinalMsg(amt.toString(), customer.getName(), "7.5%", ""));
		}
		return customer;
	}

	private String getFinalMsg(String amt, String name, String roi, String reason) {
		return "Hi " + name + " You can get Loan of " + amt + "lacs at " + roi + reason;
	}

}
