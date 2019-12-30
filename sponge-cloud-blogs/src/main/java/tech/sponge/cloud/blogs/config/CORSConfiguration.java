package tech.sponge.cloud.blogs.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tech.sponge.cloud.blogs.handler.CORSHandlerInterceptor;

/**
 * 解决前端调用后端接口出现跨域问题的相关配置
 */
@Configuration
public class CORSConfiguration implements WebMvcConfigurer {

    //将RestTemplate对象注入到spring中
    @Bean
    @LoadBalanced //开启 Ribbon 负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    //定义负载均衡算法,默认使用轮询算法
    @Bean
    public IRule myRule(){
        //此处可以根据官方提供的负载均衡算法来选择使用哪一个
        return new RoundRobinRule();

    }

    @Autowired
    private CORSHandlerInterceptor corsHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsHandlerInterceptor).addPathPatterns("/**");
    }
}
