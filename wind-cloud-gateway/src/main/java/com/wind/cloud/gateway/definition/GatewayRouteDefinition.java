package com.wind.cloud.gateway.definition;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Gateway的路由定义模型
 * @ClassName: GatewayRouteDefinition
 * @Description: <br>
 * @DATE: 2020/3/27 17:22
 * @Author: hyj
 * @Version: 1.0
 */
@Data
public class GatewayRouteDefinition {
    /**
     * 路由的Id
     */
    private String id;

    /**
     * 路由断言集合配置
     */
    private List<GatewayPredicateDefinition> predicates = new ArrayList<>();

    /**
     * 路由过滤器集合配置
     */
    private List<GatewayFilterDefinition> filters = new ArrayList<>();

    /**
     * 路由规则转发的目标uri
     */
    private String uri;

    /**
     * 路由执行的顺序
     */
    private int order = 0;
}
