package com.summary.java.command;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.chain.Context;


public class ReturnUtils {

    private static final String SUCCESS_CODE = "0000";
    private static final String SUCCESS_DESC = "操作成功";

    /**
     * 返回成功默认配置
     * 
     * @param context
     */
    public static void returnSuccess(Context context) {
        returnSuccess(context, SUCCESS_DESC);
    }

    /**
     * 返回成功自定义配置
     * 
     * @param context
     * @param retDesc
     *            成功描述
     */
    public static void returnSuccess(Context context, String retDesc) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("respCode", SUCCESS_CODE);
        params.put("respDesc", retDesc);
        ReturnUtils.put(context, params);
    }

    /**
     * 返回失败
     * 
     * @param context
     * @param retCode
     *            失败代码
     * @param retDesc
     *            失败描述
     */
    public static void returnFail(Context context, String retCode, String retDesc) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("respCode", retCode);
        params.put("respDesc", retDesc);
        ReturnUtils.put(context, params);
    }
    
    /**
     * 将单值封装到Context中
     * 
     * @param context
     * @param key
     * @param value
     */
    public static void put(Context context, String key, Object value) {
        context.put(key, value);
    }

    /**
     * 将多值封装到Context中
     * 
     * @param context
     * @param params
     */
    public static void put(Context context, Map<String, Object> params) {
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            context.put(entry.getKey(), entry.getValue());
        }
    }

}
