package com.au.anz.accountdetails.mapper;

import org.mapstruct.Mapper;
import org.springframework.beans.BeanUtils;

import com.au.anz.accountdetails.dto.TransactionDetailsDTO;
import com.au.anz.accountdetails.model.TransactionDetails;

@Mapper
public class TransactionDetailsMapper {

	public static TransactionDetailsDTO toTranscationDetailsDTO(TransactionDetails transactionDetails) {
		TransactionDetailsDTO transactionDetailsDTO = new TransactionDetailsDTO();
		BeanUtils.copyProperties(transactionDetails, transactionDetailsDTO);
		return transactionDetailsDTO;
	}

}
