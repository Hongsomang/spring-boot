package kr.ac.kopo.EurekaServerProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;
	
	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

}
