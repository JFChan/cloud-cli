package cn.easy.ccl.ccl.dubbo.consumer;

import cn.easy.ccl.core.CclWait;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(value = {"cn.easy.ccl.ccl.dubbo.consumer.test"})
@EnableDubbo
@ImportResource(value = {"classpath:dubbo.xml"})
@Slf4j
public class CclDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CclDubboConsumerApplication.class, args);
        CclWait.waitNow();
    }

}

