package com.summary.spring.validate;

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
}
