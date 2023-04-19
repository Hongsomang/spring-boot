package kr.ac.kopo.EurekaServerCustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;
	
	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

}
