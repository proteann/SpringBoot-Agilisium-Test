package com.basicauth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basicauth.model.Product;
import com.basicauth.service.AuthService;

@RestController
@RequestMapping(value = "/config")
public class ConfigController {

	@Autowired
	AuthService authService;

	@GetMapping(value = "/{domain}/api/getconfigdetails", produces = "application/json")
	public List<Product> getConfigDetails(@PathVariable("domain") String domain) {
		return authService.getConfigDetails(domain);
	}
}
