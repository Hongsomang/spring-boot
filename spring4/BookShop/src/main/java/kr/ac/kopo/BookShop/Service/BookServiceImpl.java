package kr.ac.kopo.BookShop.Service;

import kr.ac.kopo.BookShop.Model.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.BookShop.Dao.BookDao;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao dao;
	
	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

	@Override
	public void add(Book item) {
		// TODO Auto-generated method stub
		dao.save(item);
	}

	@Override
	public Book item(int bookid) {
		// TODO Auto-generated method stub
		return dao.findOneByBookid(bookid);
	}

	@Override
	public void update(Book item) {
		// TODO Auto-generated method stub
		dao.save(item);
	}

}
