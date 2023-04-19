package kr.ac.kopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
public class MsaConfigClientCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaConfigClientCustomerApplication.class, args);
	}

}
