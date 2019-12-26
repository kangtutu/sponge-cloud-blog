package tech.sponge.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpongeCloudEurekaApplication9100 {
    public static void main(String[] args) {
        SpringApplication.run(SpongeCloudEurekaApplication9100.class,args);
    }
}
