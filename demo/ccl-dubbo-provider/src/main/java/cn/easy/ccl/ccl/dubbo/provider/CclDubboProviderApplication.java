package cn.easy.ccl.ccl.dubbo.provider;

import cn.easy.ccl.core.CclWait;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo.xml"})
@EnableDubbo(scanBasePackages = "cn.easy.ccl.ccl.dubbo.provider")
@ComponentScan(value = {"cn.easy.ccl.ccl.dubbo.provider.*"})
public class CclDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CclDubboProviderApplication.class, args);
        CclWait.waitNow();
    }


}
