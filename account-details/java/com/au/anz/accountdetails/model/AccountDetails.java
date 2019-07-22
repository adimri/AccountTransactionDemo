package com.au.anz.accountdetails.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_account_details")
public class AccountDetails {

	@Id
	@Column(name = "account_number")
	private Long accountNumber;

	@Column(name = "account_name", nullable = false)
	private String accountName;

	@Column(name = "account_type", nullable = false)
	private String accountType;

	@Column(name = "balanceDate", nullable = false)
	private Timestamp balanceDate;

	@Column(name = "currency", nullable = false)
	private String currency;

	@Column(name = "opening_avl_balance", nullable = false)
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
