package com.ctrip.triplay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
public class SpringSessionConfig {
    //配置JSESSIONID的作用域
    @Bean
    public CookieSerializer cookieSerializer() {
        DefaultCookieSerializer defaultCookieSerializer = new DefaultCookieSerializer();
        defaultCookieSerializer.setCookieName("triplay");
        defaultCookieSerializer.setDomainName("localhost");
        defaultCookieSerializer.setCookiePath("/");
        return defaultCookieSerializer;
    }
}
