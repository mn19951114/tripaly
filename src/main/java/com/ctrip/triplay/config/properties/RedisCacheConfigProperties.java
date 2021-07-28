package com.ctrip.triplay.config.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "redis.cache")
@Component
@Data
public class RedisCacheConfigProperties {
    private String host;
    private int port;
    private int maxTotal;
    private int timeout;
    private int maxIdle;
    private int minIdle;
    private int maxWait;
    private boolean testOnBorrow;
    private boolean testOnReturn;
}
