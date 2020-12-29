package com.ata.sp01.service;

import com.ata.sp01.pojo.Order;

public interface OrderService {

	Order getOrder(String orderId);
	void addOrder(Order order);
}
