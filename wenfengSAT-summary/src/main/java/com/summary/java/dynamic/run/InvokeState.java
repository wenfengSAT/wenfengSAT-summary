package com.summary.java.dynamic.run;

/**
 * 
 * @Description： 功能描述
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2019年10月14日下午12:11:55]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public enum InvokeState {
	/**
	 * 支付
	 */
	alipayPrecreate("alipayPrecreate"),
	;

	public String processCode;

	InvokeState(String processCode) {
		this.processCode = processCode;
	}
}
