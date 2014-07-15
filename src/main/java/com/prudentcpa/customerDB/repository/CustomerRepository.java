package com.prudentcpa.customerDB.repository;

import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.stereotype.Repository;

import com.prudent.domain.Customer;

/**
 * Gemfire doesn't handle pagination.  
 * 
 * http://docs.spring.io/spring-data/rest/docs/current/reference/htmlsingle/
 * 
 * @author zhue
 *
 */

@Repository
public interface CustomerRepository extends GemfireRepository<Customer, Long> {

	Customer findByCustomerID(String customerid);
}
