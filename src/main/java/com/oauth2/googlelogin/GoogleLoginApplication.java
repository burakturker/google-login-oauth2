package com.oauth2.googlelogin;

import com.oauth2.googlelogin.jwt.JwtConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({JwtConfig.class})
public class GoogleLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogleLoginApplication.class, args);
    }

}
