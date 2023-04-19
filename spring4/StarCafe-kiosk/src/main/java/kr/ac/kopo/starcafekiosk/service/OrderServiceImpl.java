package kr.ac.kopo.starcafekiosk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.starcafekiosk.dao.OrderDao;


@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao dao;
	
	@Override
	public void add(int id) {
		// TODO Auto-generated method stub
		dao.add(id);
	}

}
