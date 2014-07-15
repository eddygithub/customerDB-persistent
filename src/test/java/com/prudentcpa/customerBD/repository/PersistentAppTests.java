package com.prudentcpa.customerBD.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prudent.domain.Customer;
import com.prudentcpa.customerDB.repository.CustomerRepository;
import com.prudentcpa.customerDB.repository.PersistentApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PersistentApplication.class)
public class PersistentAppTests {

	@Autowired
	CustomerRepository customerRepo;
	
	@Test
	public void testCustomerRepo() {
		Customer newCustomer = new Customer("Gary", "J", "Goodman", "123-12-1234");
		newCustomer.setCustomerID("1");
		customerRepo.save(newCustomer);
		
		Customer retrievedCust = customerRepo.findByCustomerID("1");
		assertEquals(newCustomer, retrievedCust);
	}

}
