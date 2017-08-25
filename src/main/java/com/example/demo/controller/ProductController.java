package com.example.demo.controller;

import com.example.demo.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;

	
@RestController
@RequestMapping("product")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(method= RequestMethod.GET)
	public List<Product> index() {
		//modelMap.put("product", productService.findAll());
		//return "product/index";
		System.out.println("inside getProducts"+productService.findAll());
		return productService.findAll();
	}
	
}
