package com.tejas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("loanSIConfig.xml");
		Loan loan = (Loan) context.getBean("loan");
		loan.getCust(cusList());

	}

	private static List<Customer> cusList() {
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("John Cena", 900, 10000000L));
		list.add(new Customer("Vijay Mallya", 600, 10000000L));
		list.add(new Customer("Rohit", 700, 400000L));
		list.add(new Customer("Virat", 900, 9000000L));
		list.add(new Customer("Bret Lee", 550, 1000000L));
		return list;

	}
}
