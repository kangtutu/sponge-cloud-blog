package tech.sponge.cloud.blogs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;
import tech.sponge.cloud.rule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("tech.sponge.cloud.blogs.mapper")
//@RibbonClient(name = "",configuration = MySelfRule.class)
@EnableFeignClients(basePackages = {"tech.sponge.cloud.blogs"})
@Component("tech.sponge.cloud.blogs")
public class SpongeCloudBlogsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpongeCloudBlogsApplication.class,args);
    }
}
