package com.flamingo.exception;

import com.flamingo.enums.ResultEnum;

public class GirlException extends RuntimeException{

    /** 错误码 */
    private Integer code;

    /** 构造方法 父类本身可传一个message*/
    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
