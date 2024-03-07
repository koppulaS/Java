package com.Sai.Springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sai.Springboot.Dto.OrderDto;
import com.Sai.Springboot.Model.Orders;
import com.Sai.Springboot.Repository.OrderRepository;

@Service
public class OrdersService {
    @Autowired
	OrderRepository ordrepo;
	public List<OrderDto> saveOrders(Integer appId, List<OrderDto> orderdto ) {
		
		for (OrderDto orderDto2 : orderdto) {
			Orders ord1=new Orders();
			ord1.setApplicationId(appId);
			ord1.setOrderItem(orderDto2.getOrderItem());
			ordrepo.save(ord1);
			
		}
		
		return orderdto ;
		
	}
}
