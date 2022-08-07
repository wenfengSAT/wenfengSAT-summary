package com.summary.java.dynamic.run;

/**
 * 
 * @Description： 功能描述
 * 
 * @author [ Wenfeng.Huang ] on [2019年10月14日下午12:11:35]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public abstract class InvokeStatePerformer {
	private final InvokeState state;

	protected InvokeStatePerformer(InvokeState state) {
		this.state = state;
	}

	public InvokeState getState() {
		return state;
	}

	/**
	 *
	 * @param requestStr
	 *            请求参数
	 * @param <T>
	 *            响应对象类型
	 * @return
	 */
	public abstract <T> T perform(String requestStr);
}
