package com.swjtu.order.enums;

import lombok.Getter;

/**
 * @author 李天峒
 * @date 2019/4/21 21:59
 */
@Getter
public enum ResultEnum {
    /** 结果状态码*/
    PARAM_ERROR(1,"参数错误"),
    CART_EMPTY(2,"购物车为空");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}