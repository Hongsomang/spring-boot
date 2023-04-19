package kr.ac.kopo.EurekaServerProduct;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/list")
	public List<Product> list(){
		return service.list();
	}
}
