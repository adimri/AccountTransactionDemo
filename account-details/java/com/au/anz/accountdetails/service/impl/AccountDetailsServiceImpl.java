package com.au.anz.accountdetails.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.au.anz.accountdetails.model.AccountDetails;
import com.au.anz.accountdetails.repository.AccountDetailsRepository;
import com.au.anz.accountdetails.service.AccountDetailsService;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {

	@Autowired
	private AccountDetailsRepository accountDetailsRepository;

	/*
	 * Fetch list of all users where isActive=true
	 */
	@Override
	public List<AccountDetails> fetchAllAccountDetails() {
		Iterable<AccountDetails> accountDetails = accountDetailsRepository.findAll();
		return StreamSupport.stream(accountDetails.spliterator(), false).collect(Collectors.toList());
	}

}
