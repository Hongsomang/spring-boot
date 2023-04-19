package kr.ac.kopo.Bookshop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.Bookshop.Dao.BookDao;
import kr.ac.kopo.Bookshop.Model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao dao;
	
	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

}
