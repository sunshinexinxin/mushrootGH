package com.hyx.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author anke
 * @date 2018/5/21
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截器规则：除了login,其他都拦截判断
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/mushRoomGH/**").excludePathPatterns("/mushRoomGH/login", "/mushRoomGH/logout/");
        super.addInterceptors(registry);
    }
}
