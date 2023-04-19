package kr.ac.kopo.starcafekiosk.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public void add(int id) {
		// TODO Auto-generated method stub
		sql.insert("order.add",id);
	}

}
