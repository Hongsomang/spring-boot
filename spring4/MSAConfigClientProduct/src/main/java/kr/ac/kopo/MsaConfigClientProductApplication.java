package kr.ac.kopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
public class MsaConfigClientProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaConfigClientProductApplication.class, args);
	}

}
