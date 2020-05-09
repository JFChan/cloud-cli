package cn.easysw.ccl.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CclGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CclGatewayApplication.class, args);
	}

}
