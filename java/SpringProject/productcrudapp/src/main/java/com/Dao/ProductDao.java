package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Model.Product;

@Component
@Service
@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}
	
	@Transactional
	public void updateProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	@Transactional
	public List<Product> getProducts(){
		return this.hibernateTemplate.loadAll(Product.class);
	}
	
	@Transactional
	public void deleteProduct(int pid) {
		Product product=this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}
	@Transactional
	public Product getByIdProduct(int pid) {
		Product product=this.hibernateTemplate.get(Product.class, pid);
		return product;
	}
}
