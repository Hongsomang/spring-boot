package kr.ac.kopo.BookShop.Service;

import kr.ac.kopo.BookShop.Model.Book;
import java.util.List;

public interface BookService {

	List<Book> list();

	void add(Book item);

	Book item(int bookid);

	void update(Book item);

}
