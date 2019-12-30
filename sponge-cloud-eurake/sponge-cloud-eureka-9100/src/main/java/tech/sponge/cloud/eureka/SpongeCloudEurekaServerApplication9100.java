package tech.sponge.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启 SpringCloud Eureka 注册中心自动配置
public class SpongeCloudEurekaServerApplication9100 {
    public static void main(String[] args) {
        SpringApplication.run(SpongeCloudEurekaServerApplication9100.class,args);
    }
}
