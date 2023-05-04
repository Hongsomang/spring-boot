package kr.ac.kopo.bookshop.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.ac.kopo.bookshop.model.Movie;
import kr.ac.kopo.bookshop.service.MovieService;

@Controller
@RequestMapping("/movie")
public class MovieController {

	final String path="movie/";
	
	@Autowired
	MovieService service;

	@Value("${kopo.upload-path}")
	private String uploadPath;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Movie> list=service.list();
		model.addAttribute("list",list);
		return path+"list";
	}
	
	@GetMapping("/add")
	public String add() {
		return path+"add";
	}
	@PostMapping("/add")
	public String add(Movie item,MultipartFile uploadFile) {
		System.out.println(uploadFile.getOriginalFilename());
		
		if(!uploadFile.isEmpty()) {
			String filename=uploadFile.getOriginalFilename();
			String uuid= UUID.randomUUID().toString();
			
			try {
				uploadFile.transferTo(new File(uploadPath+uuid+"_"+filename));
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//service.add(item);
		}
		
		return "redirect:list";
		
	}
	
	@GetMapping("/update/{movieId}")
	public String update(@PathVariable int movieId,Model model) {
		Movie item=service.item(movieId);
		
		model.addAttribute("item",item);
		return path+"update";
	}
	
	@PostMapping("/update/{movieId}")
	public String update(@PathVariable int movieId, Movie item) {
		
		service.update(item);
		return "redirect:../list";
	}
	@GetMapping("/delete/{movieId}")
	public String delete(@PathVariable int movieId) {
		service.delete(movieId);
		
		return "redirect:../list";
	}
	
}
