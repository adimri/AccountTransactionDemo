package com.au.anz.accountdetails.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.anz.accountdetails.model.TransactionDetails;
import com.au.anz.accountdetails.repository.TransactionDetailsRepository;
import com.au.anz.accountdetails.service.TransactionDetailsService;

@Service
public class TransactionDetailsServiceImpl implements TransactionDetailsService {

	@Autowired
	private TransactionDetailsRepository transactionDetailsRepository;

	@Override
	public List<TransactionDetails> fetchTransactionDetailsByAccountNumber(Long accountNumber) {
		Iterable<TransactionDetails> transactionDetails = transactionDetailsRepository.findAll();
		return StreamSupport.stream(transactionDetails.spliterator(), false)
				.filter(obj -> obj.getAccountDetails().getAccountNumber().compareTo(accountNumber) == 0)
				.collect(Collectors.toList());
	}
}