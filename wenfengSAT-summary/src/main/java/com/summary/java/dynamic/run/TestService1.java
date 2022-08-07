package com.summary.java.dynamic.run;

import org.springframework.stereotype.Service;

import cn.hutool.core.util.StrUtil;

@Service
public class TestService1 {
	
	public static class TestReq {
		
	}

	public void test1(String param) {
		System.out.println(StrUtil.format("test1 param:[{}]", param));
	}
	
	public void test2(String param) {
		System.out.println(StrUtil.format("test2 param:[{}]", param));
	}

}
