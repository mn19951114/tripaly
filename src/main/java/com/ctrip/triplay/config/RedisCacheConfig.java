package com.ctrip.triplay.config;

import com.ctrip.triplay.config.properties.RedisCacheConfigProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@Slf4j
public class RedisCacheConfig extends CachingConfigurerSupport{
    @Bean
    public JedisPool redisPoolFactory(RedisCacheConfigProperties properties) {
        log.info("JedisPool注入成功！！");
        log.info("redis地址：" + properties.getHost() + ":" + properties.getPort());
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(properties.getMaxTotal());
        jedisPoolConfig.setMaxIdle(properties.getMaxIdle());
        jedisPoolConfig.setMinIdle(properties.getMinIdle());
        jedisPoolConfig.setMaxWaitMillis(properties.getMaxWait());
        jedisPoolConfig.setTestOnBorrow(properties.isTestOnBorrow());
        jedisPoolConfig.setTestOnReturn(properties.isTestOnReturn());
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, properties.getHost(), properties.getPort(), properties.getTimeout());
        return jedisPool;
    }

}
