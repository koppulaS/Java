package com.Sai.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sai.Springboot.Model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
