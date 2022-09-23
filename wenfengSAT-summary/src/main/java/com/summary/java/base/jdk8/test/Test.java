package com.summary.java.base.jdk8.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import cn.hutool.json.JSONUtil;

/**
 * 
 * @Description： a=1,b=2,c=3 转map
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月23日下午5:32:26]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Test {

	public static void main(String[] args) {
		String str = "a=1,b=2,c=3";
		String[] strArr = str.trim().split(",");
		Map<String, String> map = Arrays.asList(strArr).stream().map(s -> s.split("="))
				.collect(Collectors.toMap(item -> item[0], item -> item[1]));
		System.out.println(JSONUtil.toJsonStr(map));
	}
}
