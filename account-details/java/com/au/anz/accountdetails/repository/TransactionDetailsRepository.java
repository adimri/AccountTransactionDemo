package com.au.anz.accountdetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.au.anz.accountdetails.model.TransactionDetails;

@Repository
public interface TransactionDetailsRepository extends CrudRepository<TransactionDetails, String> {

}
