package kr.ac.kopo.BookShop.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.BookShop.Model.Book;
import kr.ac.kopo.BookShop.Service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	final String path="book/";
	
	@Autowired
	BookService service;
	
	@GetMapping("/list")
	public String list(Model model){
		List<Book> list=service.list();
		
		model.addAttribute("list",list);
		
		
		return path+"list";
	}
	
	@GetMapping("/add")
	public String add() {
		return path+"add";
	}
	
	@PostMapping("/add")
	public String add(Book item) {
		service.add(item);
		
		return "redirect:list";
	}
	
	
	@GetMapping("update/{bookid}")
	public String update(@PathVariable int bookid, Model model) {
		Book item=service.item(bookid);
		model.addAttribute("item",item);
		
		return path+"update";
	}
	
	@PostMapping("update/{bookid}")
	public String update(@PathVariable int bookid,Book item) {
		item.setBookid(bookid);
		service.update(item);
		return "redirect:../list";
	}
}
