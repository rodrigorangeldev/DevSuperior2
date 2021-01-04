package com.rodrigorangeldev.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigorangeldev.dsdeliver.dto.OrderDTO;
import com.rodrigorangeldev.dsdeliver.dto.ProductDTO;
import com.rodrigorangeldev.dsdeliver.entities.Order;
import com.rodrigorangeldev.dsdeliver.entities.Product;
import com.rodrigorangeldev.dsdeliver.repositories.OrderRepository;
import com.rodrigorangeldev.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional
	public List<OrderDTO> findAll(){
		
		List<Order> list = repository.findOrdersWithProducts();
		
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
		
	}

}
