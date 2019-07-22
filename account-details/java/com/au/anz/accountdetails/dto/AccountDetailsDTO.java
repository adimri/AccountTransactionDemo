package com.au.anz.accountdetails.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDetailsDTO {

	private Long accountNumber;

	private String accountName;

	private String accountType;

	private Timestamp balanceDate;

	private String currency;

	private BigDecimal openingAvlBal;

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Timestamp getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Timestamp balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getOpeningAvlBal() {
		return openingAvlBal;
	}

	public void setOpeningAvlBal(BigDecimal openingAvlBal) {
		this.openingAvlBal = openingAvlBal;
	}

}
