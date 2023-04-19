package kr.ac.kopo.starcafekiosk;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
//리본 로드벨런스 
//로드 -적제/부화
//n개의 로드를 놓고 일을 분산 시켜줌
//문제가 생기면 그 부분을 보내지 않고 살아있는 부분으로 일을 보냄
@RibbonClient(name="starcafe",configuration=StarcafeRibbonConfig.class)
public class Appconfig {

	@Bean()
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
