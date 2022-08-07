package com.summary.demo.ifelse.enumerate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @Description： 业务处理工具类
 * 
 * @author [ Wenfeng.Huang ] on [2019年9月24日上午10:26:09]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Component
public class HanderUtil {

	@Autowired
	private BeanUtils beanUtils;

	public String handle(String beanName) {

		AbstractHandler handler = (AbstractHandler) beanUtils.getBean(Bean.getBeanName(beanName));
		return handler.handle(beanName);
	}

}
