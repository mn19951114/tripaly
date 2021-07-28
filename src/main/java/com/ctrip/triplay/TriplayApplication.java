package com.ctrip.triplay;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
@EnableCaching
@EnableRabbit
@EnableRedisHttpSession
@SpringBootApplication
public class TriplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TriplayApplication.class, args);
    }

}
