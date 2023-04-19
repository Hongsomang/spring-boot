package kr.ac.kopo.EurekaServerCustomer;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImp implements CustomerDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return sql.selectList("customer.list");
	}

}
