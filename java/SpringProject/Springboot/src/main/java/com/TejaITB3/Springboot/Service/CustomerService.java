package com.TejaITB3.Springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TejaITB3.Springboot.Dto.CustomerDto;
import com.TejaITB3.Springboot.Model.Customer;
import com.TejaITB3.Springboot.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	public CustomerDto saveCustomer(Integer appId,CustomerDto customerdto) {
		
		
		Customer cum=new Customer();
		cum.setApplicationId(appId);
		cum.setName(customerdto.getName());
		repository.save(cum);
		
		return customerdto;
		
	}
}
