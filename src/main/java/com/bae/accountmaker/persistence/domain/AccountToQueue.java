package com.bae.accountmaker.persistence.domain;

public class AccountToQueue {

	private String accountNumber;
	private String firstName;
	private String lastName;
	private String prize;

	public AccountToQueue(String firstName, String lastName, String accountNumber, String prize) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.prize = prize;

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public AccountToQueue() {
	}

}
