package kr.ac.kopo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	HelloDao dao;
	
	public String msg() {
		return "Hello..." + dao.msg();
	}
}
