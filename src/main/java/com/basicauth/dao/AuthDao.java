package com.basicauth.dao;

import java.util.List;

import com.basicauth.model.Product;

public interface AuthDao {

	List<Product> getProductDetails(String domain);

	List<Product> getConfigDetails(String domain);

}
