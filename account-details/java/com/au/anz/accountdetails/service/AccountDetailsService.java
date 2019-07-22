package com.au.anz.accountdetails.service;

import java.util.List;

import com.au.anz.accountdetails.model.AccountDetails;

public interface AccountDetailsService {

	List<AccountDetails> fetchAllAccountDetails();
}
