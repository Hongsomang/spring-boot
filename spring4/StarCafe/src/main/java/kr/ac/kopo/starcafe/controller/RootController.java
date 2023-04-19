package kr.ac.kopo.starcafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {
	
	@RequestMapping("/") 
	public String index() {
		return "index";
	}
	
	//ping 받는 부분
	@ResponseBody
	@RequestMapping("/ping")
	public String ping() {
		return "ok";
	}
}
