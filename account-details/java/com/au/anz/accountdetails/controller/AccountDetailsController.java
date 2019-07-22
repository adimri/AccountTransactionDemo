package com.au.anz.accountdetails.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.au.anz.accountdetails.dto.AccountDetailsDTO;
import com.au.anz.accountdetails.dto.TransactionDetailsDTO;
import com.au.anz.accountdetails.exception.AccountNotFoundException;
import com.au.anz.accountdetails.mapper.AccountDetailsMapper;
import com.au.anz.accountdetails.mapper.TransactionDetailsMapper;
import com.au.anz.accountdetails.model.AccountDetails;
import com.au.anz.accountdetails.model.TransactionDetails;
import com.au.anz.accountdetails.service.AccountDetailsService;
import com.au.anz.accountdetails.service.TransactionDetailsService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/account")
public class AccountDetailsController {

	public static final Logger logger = LoggerFactory.getLogger(AccountDetailsController.class);

	@Autowired
	private AccountDetailsService accountDetailsService;

	@Autowired
	private TransactionDetailsService transactionDetailsService;

	@ApiOperation(value = "Fetch transaction details of an Account Number")
	@GetMapping(value = "/{acountNumber}")
	public ResponseEntity<List<TransactionDetailsDTO>> fetchAccountDetailsByAccountNumber(
			@ApiParam(value = "Username of the user to be deleted", required = true) @PathVariable("acountNumber") Long acountNumber) {
		logger.info("Ftech transaction details of the account with account number " + acountNumber);
		List<TransactionDetailsDTO> transactionDetailsDTO = new ArrayList<>();
		try {
			for (TransactionDetails transactionDetails : transactionDetailsService
					.fetchTransactionDetailsByAccountNumber(acountNumber)) {
				transactionDetailsDTO.add(TransactionDetailsMapper.toTranscationDetailsDTO(transactionDetails));
			}

			if (transactionDetailsDTO.isEmpty()) {
				throw new AccountNotFoundException("Account " + acountNumber + " does not exist");
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage());
		}

		return new ResponseEntity<List<TransactionDetailsDTO>>(transactionDetailsDTO, HttpStatus.OK);
	}

	@ApiOperation(value = "Fetch All Account Details")
	@GetMapping
	public ResponseEntity<List<AccountDetailsDTO>> fetchAllAccountDetails() {
		List<AccountDetailsDTO> accountDetailsDTO = new ArrayList<>();
		try {
			for (AccountDetails accountDetails : accountDetailsService.fetchAllAccountDetails()) {
				accountDetailsDTO.add(AccountDetailsMapper.toAccountDetailsDTO(accountDetails));
			}
			if (accountDetailsDTO.isEmpty()) {
				logger.error("No accounts exits");
				throw new AccountNotFoundException("No account exist");
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage());
		}
		return new ResponseEntity<List<AccountDetailsDTO>>(accountDetailsDTO, HttpStatus.OK);
	}

}
