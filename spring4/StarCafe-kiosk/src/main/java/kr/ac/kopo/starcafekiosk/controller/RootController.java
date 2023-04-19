package kr.ac.kopo.starcafekiosk.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import kr.ac.kopo.starcafekiosk.model.PagerMap;
import kr.ac.kopo.starcafekiosk.model.Product;
import kr.ac.kopo.starcafekiosk.service.OrderService;

@EnableCircuitBreaker
@Controller
public class RootController {

	@Autowired
	RestTemplate rest;
	
	@Autowired
	OrderService service;
	
	public String fallbackIndex(Model model, Throwable throwable) {
		System.out.println("StarCafe 연동에 문제가 발생하였습니다."+throwable.getLocalizedMessage());
		model.addAttribute("error",throwable.getLocalizedMessage());
		model.addAttribute("list",new ArrayList<>());
		return "index";
	}
	
	//CircuitBreaker는 Hystrix 
	//오류가 났을 떄 우리의 프로그램을 보호하는거
	//다른방법으로 서비스 제공하는거
	@HystrixCommand(fallbackMethod="fallbackIndex")
	@GetMapping("/")
	public String index(Model model) {
		//RestTemplate rest=new RestTemplate();
		///스타카페라는 이름을 리본에서 읽어 온다 application을 봅시다
		String url="http://starcafe/api/product?search=5&keyword=1";
		ResponseEntity<PagerMap> resp= rest.getForEntity(url, PagerMap.class);
		PagerMap map= resp.getBody(); 
		ArrayList<Product> products = (ArrayList<Product>) map.getList();
		System.out.println(products.size());
		model.addAttribute("list",products);
			
		/*RestTemplate rest=new RestTemplate();
		ResponseEntity<HashMap> resp= rest.getForEntity(url, HashMap.class);
		HashMap<String, Object> map=resp.getBody();
		ArrayList<Product> products=(ArrayList<Product>)map.get("list");
		System.out.println(products.size());
		model.addAttribute("list",products);*/
		return "index";
	}
	@GetMapping("/order/{id}")
	public String order(@PathVariable int id) {
		service.add(id);
		return "redirect:/";
	}
}
