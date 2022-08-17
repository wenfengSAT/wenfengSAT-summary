package com.summary.spring.validate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

public class TestReq implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "字符串不能为空")
	private String strParam;

	@Valid
	@NotNull(message = "List不能为空")
	private List<TestBody> body;

	@NotNull(message = "BigDecimal不能为空")
	@DecimalMin(value = "0", message = "BigDecimal在0~99999999")
	@DecimalMax(value = "99999999", message = "BigDecimal只能在0~99999999")
	private BigDecimal bigDecimal1;

	@NotNull(message = "BigDecimal不能为空")
	@DecimalMin(value = "1", message = "BigDecimal最小是1")
	@DecimalMax(value = "99999999", message = "BigDecimal最大是99999999")
	private BigDecimal bigDecimal2 = BigDecimal.ZERO;

	@Range(max = 10, min = 1, message = "整数只能1~10")
	private int maxPurchaseNum = 0;

	@NotEmpty(message = "字符数组不能为空")
	private String[] strs;

	@NotEmpty(message = "整形数组不能为空")
	private int[] ints;

	@Setter
	@Getter
	@Valid
	public static class TestBody implements Serializable {

		private static final long serialVersionUID = 1L;
		@NotBlank(message = "字符串不能为空")
		private String strParam;

	}
}
