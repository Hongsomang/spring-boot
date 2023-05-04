package kr.ac.kopo.BookShop.Dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import kr.ac.kopo.BookShop.Model.Book;

public interface BookDao extends Repository<Book, Integer> {

	List<Book> findAll();

	void save(Book item);

	Book findOneByBookid(int bookid);
	
	
}
