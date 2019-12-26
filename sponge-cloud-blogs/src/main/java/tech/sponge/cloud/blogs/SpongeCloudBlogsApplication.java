package tech.sponge.cloud.blogs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("tech.sponge.cloud.blogs.mapper")
public class SpongeCloudBlogsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpongeCloudBlogsApplication.class,args);
    }
}
