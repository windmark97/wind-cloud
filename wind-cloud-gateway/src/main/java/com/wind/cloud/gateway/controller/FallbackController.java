package com.wind.cloud.gateway.controller;

import com.wind.cloud.gateway.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: FallbackController
 * @Description: <br>
 * @DATE: 2020/3/27 17:20
 * @Author: hyj
 * @Version: 1.0
 */
@RestController
public class FallbackController {
    @GetMapping("/fallback")
    public Response fallback() {
        Response response = new Response();
        response.setCode("100");
        response.setMessage("服务暂时不可用");
        return response;
    }
}
