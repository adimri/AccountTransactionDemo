package com.au.anz.accountdetails.service;

import java.util.List;

import com.au.anz.accountdetails.model.TransactionDetails;

public interface TransactionDetailsService {

	List<TransactionDetails> fetchTransactionDetailsByAccountNumber(Long accountNumber);

}
