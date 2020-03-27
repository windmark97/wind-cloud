package com.wind.cloud.gateway.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: Response
 * @Description: <br>
 * @DATE: 2020/3/27 15:41
 * @Author: hyj
 * @Version: 1.0
 */
@Data
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -996668240284233522L;
    private String code;
    private String message;
    private T data;

}
