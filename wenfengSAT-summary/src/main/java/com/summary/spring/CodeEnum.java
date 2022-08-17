package com.summary.spring;

/**
 * 
 * @Description： 异常返回码枚举接口
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2021年6月15日下午4:32:15]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public interface CodeEnum {

	/**
	 * 
	 * @Description： 获取返回码
	 * 
	 * @author [ Wenfeng.Huang@desay-svautomotive.com ]
	 * @Date [2021年6月15日下午4:37:59]
	 * @return
	 *
	 */
	int getCode();

	/**
	 * 
	 * @Description： 获取返回信息
	 * 
	 * @author [ Wenfeng.Huang@desay-svautomotive.com ]
	 * @Date [2021年6月15日下午4:38:09]
	 * @return
	 *
	 */
	String getMsg();

}

