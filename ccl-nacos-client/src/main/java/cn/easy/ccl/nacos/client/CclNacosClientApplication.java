package cn.easy.ccl.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//服务注册发现
@EnableDiscoveryClient
public class CclNacosClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CclNacosClientApplication.class, args);
	}

}
