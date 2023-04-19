package kr.ac.kopo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
public class HelloBootApplication {	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(HelloBootApplication.class, args);
		
		HelloService service = (HelloService) ctx.getBean("helloService");
		
		System.out.println("Service: " + service.msg());
		
		HelloDao dao = (HelloDao) ctx.getBean("helloDao");
		
		System.out.println("Dao: " + dao.msg());
	}

}
