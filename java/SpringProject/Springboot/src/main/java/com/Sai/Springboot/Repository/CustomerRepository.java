package com.Sai.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sai.Springboot.Model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
