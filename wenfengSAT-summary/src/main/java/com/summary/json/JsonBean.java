package com.summary.json;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * @Description： JSON测试实体
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年8月18日上午9:29:09]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Data
public class JsonBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String strParam;
	private int intParam;

}
