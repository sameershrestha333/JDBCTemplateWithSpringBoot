package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> findAll() {
		return this.jdbcTemplate.query("select * from product",
				new BeanPropertyRowMapper<Product>(Product.class));
	}
/*	@Override
	public List<Product> findAll() {
		List<Product> listOfProduct=new ArrayList<>();
		listOfProduct.add(new Product(101, "Soap", 1, 105, "Good Soap"));
		listOfProduct.add(new Product(102, "Mobile", 2, 400, "Samsung Mobile"));
		listOfProduct.add(new Product(103, "TV", 3, 500, "Lg Tv"));

		return listOfProduct;
		
		
	}*/

	@Override
	public Product find(int id) {
		return this.jdbcTemplate.queryForObject("select * from product where id = ?", 
				new BeanPropertyRowMapper<Product>(Product.class),id);
	}

	/*@Override
	public Product find(int id) {
		return null;
	}*/
}
