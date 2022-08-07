package com.summary.java.base;



import cn.hutool.core.util.StrUtil;

/**
 * 
 * @Description： 占位符使用
 * 
 * @author [ Wenfeng.Huang ] on [2019年8月23日下午6:37:25]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Placeholder {

	
	public void test() {
		System.err.println(StrFormat("ID"));
	}

	public String StrFormat(Object... str) {
		String msg = "请求参数[{}]错误";
		return StrUtil.format(msg, str);
	}
}
