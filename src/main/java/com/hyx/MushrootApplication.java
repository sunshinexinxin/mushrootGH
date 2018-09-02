package com.hyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * @author anke
 */
@SpringBootApplication
public class MushrootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MushrootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MushrootApplication.class, args);
    }
}
