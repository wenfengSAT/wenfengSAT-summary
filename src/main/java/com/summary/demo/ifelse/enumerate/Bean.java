package com.summary.demo.ifelse.enumerate;

/**
 * 
 * @Description： 枚举-Bean定义
 * 
 * @author [ Wenfeng.Huang ] on [2019年9月24日上午10:24:12]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public enum Bean {

	A("A", "AHandler"), B("B", "BHandler"), C("C", "CHandler");

	private String key;
	private String value;

	private Bean(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public static String getBeanName(String key) {
		for (Bean bean : values()) {
			if (bean.getKey().equals(key)) {
				return bean.getValue();
			}
		}
		return null;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
