package kr.ac.kopo.EurekaZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//사용자가 보내주는 결과를 연결된 서버에 보내는 중간역할을 해줌
//apigateway
@EnableZuulProxy
//eureka랑 연결시켜 주는거
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulApplication.class, args);
	}

}
