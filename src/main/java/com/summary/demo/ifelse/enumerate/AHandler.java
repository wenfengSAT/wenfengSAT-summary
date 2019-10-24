package com.summary.demo.ifelse.enumerate;

import org.springframework.stereotype.Component;

/**
 * 
 * @Description： A业务处理类
 * 
 * @author [ Wenfeng.Huang ] on [2019年9月24日上午10:23:42]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Component("AHandler")
public class AHandler extends AbstractHandler {

	@Override
	public String handle(String orderId) {

		return "A";
	}

}
