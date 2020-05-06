package com.basicauth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basicauth.dao.AuthDao;
import com.basicauth.model.Product;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	AuthDao authDao;

	@Override
	public List<Product> getProductDetails(String domain) {
		return authDao.getProductDetails(domain);
	}

	@Override
	public List<Product> getConfigDetails(String domain) {
		return authDao.getConfigDetails(domain);
	}

}
