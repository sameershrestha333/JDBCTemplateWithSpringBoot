package com.example.demo.dao;

import java.util.*;
import com.example.demo.model.*;

public interface ProductDAO {
	
	public List<Product> findAll();
	public Product find (int id);

}
