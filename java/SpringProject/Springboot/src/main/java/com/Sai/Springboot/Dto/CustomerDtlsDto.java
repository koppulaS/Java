package com.Sai.Springboot.Dto;

import java.util.List;   //in this class we are aggregating all the data//

import lombok.Data;

@Data
public class CustomerDtlsDto {
Integer applicationId;
CustomerDto customerdto;
WalletDto walletdto;
 List<OrderDto> orderdto;
	
}
