package com.Sai.Springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sai.Springboot.Dto.CustomerDtlsDto;
import com.Sai.Springboot.Dto.CustomerDto;
import com.Sai.Springboot.Dto.OrderDto;
import com.Sai.Springboot.Dto.WalletDto;
import com.Sai.Springboot.Service.CustomerService;
import com.Sai.Springboot.Service.OrdersService;
import com.Sai.Springboot.Service.WalletService;

@RequestMapping("/Customer")
@RestController
public class CustomerdtlsController {

	@Autowired
	CustomerService cusService;
	
	@Autowired
	WalletService walService;
	
	@Autowired
	OrdersService ordService;
	
	@PostMapping("/saveCustdata")
	public ResponseEntity<CustomerDtlsDto> savecustomerdata(@RequestBody CustomerDtlsDto dtlsdto ){
		Integer appId=dtlsdto.getApplicationId();
		System.out.println("app id is"+appId);
		CustomerDto cudto=cusService.saveCustomer(appId,dtlsdto.getCustomerdto());
		WalletDto wdto=walService.savewallet(appId,dtlsdto.getWalletdto());
		List<OrderDto> list =ordService.saveOrders(appId,dtlsdto.getOrderdto() );
		dtlsdto.setApplicationId(appId);
		dtlsdto.setCustomerdto(cudto);
		dtlsdto.setWalletdto(wdto);
		dtlsdto.setOrderdto(list);
		return new ResponseEntity<CustomerDtlsDto>(dtlsdto,HttpStatus.OK);
		
	}
}
