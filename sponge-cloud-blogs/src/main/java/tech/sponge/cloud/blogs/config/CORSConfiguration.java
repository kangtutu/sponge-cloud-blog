package tech.sponge.cloud.blogs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tech.sponge.cloud.blogs.handler.CORSHandlerInterceptor;

/**
 * 解决前端调用后端接口出现跨域问题的相关配置
 */
@Configuration
public class CORSConfiguration implements WebMvcConfigurer {

    @Autowired
    private CORSHandlerInterceptor corsHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsHandlerInterceptor).addPathPatterns("/**");
    }
}
