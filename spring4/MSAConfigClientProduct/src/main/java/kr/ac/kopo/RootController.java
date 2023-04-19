package kr.ac.kopo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@RefreshScope
@Controller
public class RootController {

	@Value("${kopo.msg}")
	private String msg;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", msg);
		return "index";
	}
}
