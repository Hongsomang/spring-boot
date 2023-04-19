package kr.ac.kopo.EurekaServerProduct;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SqlSession sql;

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return sql.selectList("product.list");
	}
}
