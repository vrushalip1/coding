package net.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repos;
	
	public List<Product> listAll() {
		return repos.findAll();
	}
	
	public void save(Product product) {
		repos.save(product);
		
	}
	
	public Product get(Integer id) {
		
		return repos.findById(id).get();
		
	}
	
	public void delete(Integer id) {
		repos.deleteById(id);
	}
	
}
