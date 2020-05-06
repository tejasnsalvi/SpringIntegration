package com.tejas.service;

public class Customer {

	private String name;
	private Integer creditScore;
	private Long loanAmount;
	private String msg;
	
	public Customer(String name, Integer creditScore, Long loanAmount) {
		super();
		this.name = name;
		this.creditScore = creditScore;
		this.loanAmount = loanAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", creditScore=" + creditScore + ", loanAmount=" + loanAmount + ", msg=" + msg
				+ "]";
	}

}
