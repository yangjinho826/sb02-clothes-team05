package com.team5.clothes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

import java.io.IOException;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 1) 로깅 인터셉터
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LogInterceptor())
//                .order(1)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/css/**", "/*.ico", "/error");
//    }

    // 2) SPA 진입점 포워딩용 리소스 핸들러
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")                    // 모든 경로를 잡아서
                .addResourceLocations("classpath:/static/")   // static 폴더에서 리소스 찾고
                .resourceChain(false)                         // 캐시 체인 비활성화
                .addResolver(new PathResourceResolver() {
                    @Override
                    protected Resource getResource(String resourcePath, Resource location) throws IOException {

                        if (resourcePath == null || resourcePath.isEmpty() || !location.createRelative(resourcePath).exists() || !location.createRelative(resourcePath).isReadable()) {
                            return new ClassPathResource("static/index.html");
                        }

                        return location.createRelative(resourcePath);
                    }
                });
    }
}
