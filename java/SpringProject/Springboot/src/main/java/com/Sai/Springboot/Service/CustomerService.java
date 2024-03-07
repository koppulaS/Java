package com.Sai.Springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sai.Springboot.Dto.CustomerDto;
import com.Sai.Springboot.Model.Customer;
import com.Sai.Springboot.Repository.CustomerRepository;

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
