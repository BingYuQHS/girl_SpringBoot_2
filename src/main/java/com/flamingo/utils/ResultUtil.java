package com.flamingo.utils;


import com.flamingo.domain.Result;

public class ResultUtil {

    /** 验证成功 返回dada*/
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    /** 验证成功 返回data为null*/
    public static Result success() {
        return success(null);
    }

    /** 验证失败 */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
