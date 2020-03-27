package com.wind.cloud.gateway.definition;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName: GatewayPredicateDefinition
 * @Description: <br>
 * @DATE: 2020/3/27 17:22
 * @Author: hyj
 * @Version: 1.0
 */
@Data
public class GatewayPredicateDefinition {
    /**
     * 断言对应的Name
     */
    private String name;

    /**
     * 配置的断言规则
     */
    private Map<String, String> args = new LinkedHashMap<>();
}
