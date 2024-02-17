package com.TejaITB3.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TejaITB3.Springboot.Model.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer> {

}
