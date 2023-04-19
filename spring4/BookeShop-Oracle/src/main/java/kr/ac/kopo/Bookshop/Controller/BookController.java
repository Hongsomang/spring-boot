package kr.ac.kopo.Bookshop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.Bookshop.Model.Book;
import kr.ac.kopo.Bookshop.Service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	final String path="book/";
	
	@Autowired
	BookService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Book> list=service.list();
		model.addAttribute("list",list);
		return path+"list";
		
	}
	
}
