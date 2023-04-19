package kr.ac.kopo.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("msg","한국폴리텍대학");
		return "index";
	}
}
