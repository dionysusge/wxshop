package com.javaclimb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; //替换了之前的WebMvcConfigurationSupport的配置

/**
 * 全局拦截配置，随着springboot启动就会加载
 */

@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {
    // 实现该接口其实不会导致静态资源被拦截
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/end/page/**")
                .excludePathPatterns("/end/page/login.html");
    }

}
