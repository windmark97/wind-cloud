package com.wind.cloud.gateway.config;

import lombok.Data;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;

import java.util.Map;

/**
 * @ClassName: LimitConfig
 * @Description: <br>
 * @DATE: 2020/3/27 17:18
 * @Author: hyj
 * @Version: 1.0
 */
@Data
public class LimitConfig {
    private String routeId;
    Map<String, RedisRateLimiter.Config> tokenConfig;
}
