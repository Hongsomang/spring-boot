package kr.ac.kopo.hello;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@RequestMapping
	public HashMap<String , Object> index() {
		HashMap<String, Object> map=new HashMap<>();
		
		map.put("name", "안광민");
		map.put("tel", "010-212-5406");
		map.put("dept", "스마트소프트웨어과");
		return map;
	}
}
