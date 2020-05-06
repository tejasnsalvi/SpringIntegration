package com.tejas.service;

import java.io.File;
import java.util.List;

import org.springframework.integration.annotation.Gateway;

/**
 * Gateway interface. Provides facade to clients of the process pipeline Will
 * place all Files into the readChannel
 *
 *
 */
public interface Loan {

	@Gateway(requestChannel = "readChannel")
	void getCust(List<Customer> customers);

}