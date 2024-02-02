package com.ravi.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.emart.model.Category;
import com.ravi.emart.model.Product;
import com.ravi.emart.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	// fetching all products
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	//add product
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	//remove product by id
	public void removeProductById(long id) {
		productRepository.deleteById(id);
	}
	//find product 
	public Optional<Product> getProductById(long id){
		return productRepository.findById(id);	
	}
	public List<Product> getAllProductsByCategoryId(int id){
		return productRepository.findAllByCategory_Id(id);
	}
	
}
