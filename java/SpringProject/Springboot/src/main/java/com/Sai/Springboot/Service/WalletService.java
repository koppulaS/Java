package com.Sai.Springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Sai.Springboot.Dto.WalletDto;
import com.Sai.Springboot.Model.Wallet;
import com.Sai.Springboot.Repository.WalletRepository;

@Service
public class WalletService {
     
	@Autowired
	WalletRepository wwRepository;
	public WalletDto savewallet(Integer appId,WalletDto walletdto) {
		
		Wallet ww=new Wallet();
		ww.setApplicationId(appId);
		ww.setAmount(walletdto.getAmount());
		wwRepository.save(ww);
		return walletdto ;
		
	}
}
