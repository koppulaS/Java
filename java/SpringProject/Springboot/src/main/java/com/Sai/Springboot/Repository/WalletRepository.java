package com.Sai.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sai.Springboot.Model.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {

}
