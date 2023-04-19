package kr.ac.kopo.Bookshop.Dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.Bookshop.Model.Book;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return sql.selectList("book.list");
	}
	

}
