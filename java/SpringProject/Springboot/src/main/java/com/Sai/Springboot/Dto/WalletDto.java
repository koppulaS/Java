package com.Sai.Springboot.Dto;

import lombok.Data; //@Data represents = @Setter,@getter,@toString

@Data
public class WalletDto {
	double amount;
	Integer applicationId;
	
}
