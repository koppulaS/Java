package com.TejaITB3.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TejaITB3.Springboot.Model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
