package com.summary.demo.ifelse.enumerate;

import org.springframework.stereotype.Component;

/**
 * 
 * @Description： C业务处理类
 * 
 * @author [ Wenfeng.Huang ] on [2019年9月24日上午10:25:35]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Component("CHandler")
public class CHandler extends AbstractHandler {

	@Override
	public String handle(String orderId) {

		return "C";
	}

}
