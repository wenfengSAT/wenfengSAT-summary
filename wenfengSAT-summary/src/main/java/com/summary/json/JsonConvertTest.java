package com.summary.json;

import java.util.List;

import cn.hutool.json.JSONUtil;

/**
 * 
 * @Description： JSON类型转换
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年8月18日上午9:31:12]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class JsonConvertTest {

	public static void main(String[] args) {
		String[] modelCodeArr = { "BYD1", "BYD2" };
		String modelCodeStr = JSONUtil.toJsonStr(modelCodeArr);
		String[] modelCode = JSONUtil.parseArray(modelCodeStr).toArray(new String[] {});
		System.out.println(modelCodeArr.length);
		System.out.println(modelCode.length);

		JsonBean bean = new JsonBean();
		bean.setIntParam(1);
		bean.setStrParam("str");
		System.out.println(JSONUtil.toJsonStr(bean));

		List<JsonBean> beanList = JSONUtil.toList("[{\"strParam\":\"str\",\"intParam\":1}]", JsonBean.class);
		System.out.println(beanList.size());
	}
}
