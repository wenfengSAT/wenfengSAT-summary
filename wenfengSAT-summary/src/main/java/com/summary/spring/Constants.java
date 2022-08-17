package com.summary.spring;

/**
 * 
 * @Description： 通用常量信息
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年6月9日下午4:30:02]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public interface Constants {
	/**
	 * UTF-8 字符集
	 */
	String UTF8 = "UTF-8";

	/**
	 * GBK 字符集
	 */
	String GBK = "GBK";

	/**
	 * 成功标记
	 */
	Integer SUCCESS = 200;

	/**
	 * 成功标记
	 */
	String SUCCESS_MSG = "success";

	/**
	 * 失败标记
	 */
	Integer FAIL = 500;

	/**
	 * 验证码 redis key
	 */
	String CAPTCHA_CODE_KEY = "captcha_codes:";

	/**
	 * 验证码有效期（分钟）
	 */
	long CAPTCHA_EXPIRATION = 2;

	/**
	 * 防重提交 redis key
	 */
	String REPEAT_SUBMIT_KEY = "repeat_submit:";

}
