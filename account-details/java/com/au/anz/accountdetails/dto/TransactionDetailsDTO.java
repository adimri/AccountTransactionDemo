package com.au.anz.accountdetails.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import com.au.anz.accountdetails.model.AccountDetails;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDetailsDTO {

	private Long transactionId;

	private Timestamp valueDate;

	private String currency;

	private BigDecimal debitAmount;

	private BigDecimal creditAmount;

	private String trancationType;

	private String transactionNarrative;

	private AccountDetails accountDetails;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Timestamp getValueDate() {
		return valueDate;
	}

	public void setValueDate(Timestamp valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}

	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getTrancationType() {
		return trancationType;
	}

	public void setTrancationType(String trancationType) {
		this.trancationType = trancationType;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

}
