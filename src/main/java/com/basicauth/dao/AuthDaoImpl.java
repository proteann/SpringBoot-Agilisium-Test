package com.basicauth.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.basicauth.model.Product;

@Repository
public class AuthDaoImpl implements AuthDao {

	private List<Product> productDetails = new ArrayList<>();

	@PostConstruct
	private void loadData() {
		productDetails.add(new Product(101, "aaaa", "domain1", "config1"));
		productDetails.add(new Product(102, "bbbb", "domain2", "config2"));
		productDetails.add(new Product(103, "cccc", "domain1", "config1"));
		productDetails.add(new Product(104, "dddd", "domain2", "config2"));
		productDetails.add(new Product(105, "eeee", "domain1", "config1"));
		productDetails.add(new Product(106, "ffff", "domain2", "config2"));
	}

	@Override
	public List<Product> getProductDetails(String domain) {
		return productDetails.stream()
				.filter(data -> data.getDomain().equals(domain))
				.collect(Collectors.toList());
	}

	@Override
	public List<Product> getConfigDetails(String domain) {
		return productDetails.stream()
				.filter(data -> data.getDomain().equals(domain))
				.collect(Collectors.toList());
	}

}
