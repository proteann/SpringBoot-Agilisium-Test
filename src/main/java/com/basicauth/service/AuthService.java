package com.basicauth.service;

import java.util.List;

import com.basicauth.model.Product;

public interface AuthService {

	List<Product> getProductDetails(String domain);

	List<Product> getConfigDetails(String domain);

}
