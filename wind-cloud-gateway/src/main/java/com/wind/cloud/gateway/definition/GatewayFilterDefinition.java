package com.wind.cloud.gateway.definition;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName: GatewayFilterDefinition
 * @Description: <br>
 * @DATE: 2020/3/27 17:23
 * @Author: hyj
 * @Version: 1.0
 */
@Data
public class GatewayFilterDefinition {
    /**
     * Filter Name
     */
    private String name;

    /**
     * 对应的路由规则
     */
    private Map<String, String> args = new LinkedHashMap<>();
}
