package com.au.anz.accountdetails.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.au.anz.accountdetails.model.AccountDetails;

@Repository
public interface AccountDetailsRepository extends CrudRepository<AccountDetails, String> {
}
