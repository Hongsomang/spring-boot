package kr.ac.kopo.EurekaServerCustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerCustomerApplication.class, args);
	}

}
