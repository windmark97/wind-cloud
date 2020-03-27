package com.wind.cloud.gateway.config;

import com.wind.cloud.gateway.filter.RateLimiterGatewayFilterFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * 限流
 *
 * @ClassName: GatewayConfig
 * @Description: <br>
 * @DATE: 2020/3/27 17:13
 * @Author: hyj
 * @Version: 1.0
 */
@Configuration
public class GatewayConfig {
        @Bean
    @Primary
    public CustomRedisRateLimiter customRedisRateLimiter(ReactiveRedisTemplate<String, String> redisTemplate,
                                                         @Qualifier(RedisRateLimiter.REDIS_SCRIPT_NAME) RedisScript<List<Long>> redisScript,
                                                         Validator validator) {
        return new CustomRedisRateLimiter(redisTemplate, redisScript, validator);
    }

    @Bean
    public RateLimiterGatewayFilterFactory rateLimiterGatewayFilterFactory(CustomRedisRateLimiter customRedisRateLimiter, CustomKeyResolver customKeyResolver) {
        return new RateLimiterGatewayFilterFactory(customRedisRateLimiter, customKeyResolver);
    }
}
