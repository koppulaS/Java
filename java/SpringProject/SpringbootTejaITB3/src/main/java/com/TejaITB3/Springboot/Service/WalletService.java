package com.TejaITB3.Springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.TejaITB3.Springboot.Dto.WalletDto;
import com.TejaITB3.Springboot.Model.Wallet;
import com.TejaITB3.Springboot.Repository.WalletRepository;

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
