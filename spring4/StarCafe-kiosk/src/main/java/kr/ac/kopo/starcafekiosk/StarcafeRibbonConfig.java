package kr.ac.kopo.starcafekiosk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class StarcafeRibbonConfig {
	@Autowired
	IClientConfig ribbonClientConfig;
	
	//스타키오스크가 프론트 스타카페가 서버//여러개를 만들어  놓아서 스타카페가 죽으면 나머지를 받아오게 하는거 
	@Bean
	public IPing ribbonPing(IClientConfig config) {
		return new PingUrl(false,"/ping"); //네트워크에서 프로그램이 살아있는지 확인하는게 핑
	}
	
	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new AvailabilityFilteringRule();
	}
}
