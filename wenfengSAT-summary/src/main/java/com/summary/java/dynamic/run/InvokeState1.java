package com.summary.java.dynamic.run;


/**
 * @Description： 功能描述
 * @Author： [Guobiao.Li@desay-svautomotive.com] on [2017/10/12 11:12]
 * Modified By： [修改人] on [修改日期] for [修改说明]
 */
public enum InvokeState1 {
	/**
     * 支付
     */
    alipayPrecreate("alipayPrecreate", TestService1.class, "alipayPrecreate", TestService1.TestReq.class, "1.0.0", "支付宝支付二维码生成接口"),
    ;
	
	public String processCode;// 服务编码
	public Class<?> service;// 服务接口类
	public String method;// 服务调用方法
	public Class<?> reqObj;// 服务调用方法请求参数实体类
	public String version;// 服务版本号
	public String desc;// 接口描述

	InvokeState1(String processCode, Class<?> service, String method, Class<?> reqObj, String version, String desc) {
		this.processCode = processCode;
		this.service = service;
		this.method = method;
		this.reqObj = reqObj;
		this.version = version;
		this.desc = desc;
	}
}