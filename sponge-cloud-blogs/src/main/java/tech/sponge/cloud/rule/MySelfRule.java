package tech.sponge.cloud.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule getRule(){
        //返回我们自定义的负载均衡算法
        return new RandomRule_SK();
    }
}
