package kr.ac.kopo.EurekaServerCustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/list")
	public List<Customer> list (){
		return service.list();
	}
}
