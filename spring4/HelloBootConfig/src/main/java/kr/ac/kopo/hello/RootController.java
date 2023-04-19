package kr.ac.kopo.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
	
	@Value("${kopo.message}")
	private String msg;
	
	@GetMapping("/")
	public String index(Model model) {
		System.out.println(msg);
		model.addAttribute("msg",msg);
		return "index";
	}
}
