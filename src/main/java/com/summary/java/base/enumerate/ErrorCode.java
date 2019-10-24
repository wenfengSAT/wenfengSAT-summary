package com.summary.java.base.enumerate;

import cn.hutool.core.util.StrUtil;

/**
 * 
 * @Description： 错误码定义枚举
 * 
 * @author [ Wenfeng.Huang ] on [2019年8月23日下午6:48:31]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public enum ErrorCode {
	SUCCESS("0000", "操作成功"),

	PARAMETER_ERROR("10100", "参数[{}]错误"), INTERFACE_REQUEST_ERROR("10102", "请求[{}]接口失败"), COMMON_ERROR("10103",
			"[{}]"),;

	private String msg;
	private String code;

	private ErrorCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	public String getCode() {
		return this.code;
	}

	public String getFormat(Object... str) {
		return StrUtil.format(this.getMsg(), str);
	}
	
	public static void main(String[] args) {
		System.err.println(ErrorCode.PARAMETER_ERROR.getCode());
		System.err.println(ErrorCode.PARAMETER_ERROR.getFormat("orderId"));
	}
}
