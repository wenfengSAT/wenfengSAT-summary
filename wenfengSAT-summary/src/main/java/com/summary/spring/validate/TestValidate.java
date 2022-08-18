package com.summary.spring.validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import cn.hutool.core.collection.CollUtil;

/**
 * 
 * @Description： 手动校验
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年8月17日下午4:25:47]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class TestValidate {

	public static void main(String[] args) {

		// testBean();
		List<TestReq> reqList = new ArrayList<TestReq>();
		TestReq req1 = new TestReq();
		TestReq req2 = new TestReq();
		reqList.add(req1);
		reqList.add(req2);
		System.err.println(getErrorMsg(reqList));
	}

	public static void testBean() {
		TestReq req = new TestReq();
		Set<ConstraintViolation<Object>> errors = Validation.buildDefaultValidatorFactory().getValidator()
				.validate(req);
		if (CollUtil.isEmpty(errors)) {
			System.out.println("校验通过");
			return;
		}
		errors.stream().forEach(error -> {
			System.err.println(error.getMessage());
		});
	}

	public static void testBeanList(List<TestReq> reqList) {
		reqList.stream().forEach(req -> {
			Set<ConstraintViolation<Object>> errors = Validation.buildDefaultValidatorFactory().getValidator()
					.validate(req);
			if (CollUtil.isEmpty(errors)) {
				System.out.println("校验通过");
				return;
			}
			errors.stream().forEach(error -> {
				System.err.println(error.getMessage());
			});
		});
	}

	public static String getErrorMsg(List<TestReq> reqList) {
		for (TestReq req : reqList) {
			Set<ConstraintViolation<Object>> errors = Validation.buildDefaultValidatorFactory().getValidator()
					.validate(req);
			if (CollUtil.isNotEmpty(errors)) {
				return CollUtil.getFirst(errors).getMessage();
			}
		}
		return "";
	}
}
