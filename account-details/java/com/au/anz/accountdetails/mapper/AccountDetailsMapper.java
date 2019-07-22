package com.au.anz.accountdetails.mapper;

import org.mapstruct.Mapper;
import org.springframework.beans.BeanUtils;

import com.au.anz.accountdetails.dto.AccountDetailsDTO;
import com.au.anz.accountdetails.model.AccountDetails;

@Mapper
public class AccountDetailsMapper {

	public static AccountDetailsDTO toAccountDetailsDTO(AccountDetails accountDetails) {
		AccountDetailsDTO accountDetailsDTO = new AccountDetailsDTO();
		BeanUtils.copyProperties(accountDetails, accountDetailsDTO);
		return accountDetailsDTO;

	}

}
