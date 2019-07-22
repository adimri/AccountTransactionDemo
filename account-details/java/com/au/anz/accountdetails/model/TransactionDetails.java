
package com.au.anz.accountdetails.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "account_transaction_details")
public class TransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "transaction_id", nullable = false)
	private Long transactionId;

	@Column(name = "value_date", nullable = false)
	private Timestamp valueDate;

	@Column(name = "currency", nullable = false)
	private String currency;

	@Column(name = "debit_amount")
	private BigDecimal debitAmount;

	@Column(name = "credit_amount")
	private BigDecimal creditAmount;

	@Column(name = "debit_credit", nullable = false)
	private String trancationType;

	@Column(name = "transaction_narrative")
	private String transactionNarrative;

	@ManyToOne
	AccountDetails accountDetails;

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

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

}
