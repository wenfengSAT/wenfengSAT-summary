package com.summary.java.command;


import org.apache.commons.chain.impl.ChainBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.summary.demo.ifelse.enumerate.BeanUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommandBeanTest {
	
	@Autowired
	private BeanUtils beanUtils;

	@Test
	public void test() throws Exception {
		ParamContext context = new ParamContext();
		context.setParam("param");
		ChainBase chainBase = init();
		boolean result = chainBase.execute(context);
		System.out.println(result);
	}
	
	public ChainBase init() {
		ChainBase chainBase = new ChainBase();
		chainBase.addCommand((ACommand) beanUtils.getBean("ACommand"));
		chainBase.addCommand((BCommand) beanUtils.getBean("BCommand"));
		chainBase.addCommand((CCommand) beanUtils.getBean("CCommand"));
		chainBase.addCommand((DCommand) beanUtils.getBean("DCommand"));
		return chainBase;
	}
}
