package kr.ac.kopo.EurekaServerProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerProductApplication.class, args);
	}

}
