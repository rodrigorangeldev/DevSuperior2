package com.rodrigorangeldev.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigorangeldev.dsdeliver.dto.ProductDTO;
import com.rodrigorangeldev.dsdeliver.entities.Product;
import com.rodrigorangeldev.dsdeliver.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional
	public List<ProductDTO> findAll(){
		
		List<Product> list = repository.findAllByOrderByName();
		
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
	}

}
