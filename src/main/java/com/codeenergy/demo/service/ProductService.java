package com.codeenergy.demo.service;

import com.codeenergy.demo.DAO.ProductDAO;
import com.codeenergy.demo.DTO.Product;

public class ProductService {
	public ProductDAO productDAO = null;
	
	public ProductService() {
		
	}
	
	public ProductService(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public Product getProduct(Integer id) {
		return productDAO.getProduct(id);
	}
}
