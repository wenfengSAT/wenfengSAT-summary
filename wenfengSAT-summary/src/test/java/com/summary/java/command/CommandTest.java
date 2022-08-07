package com.summary.java.command;


import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.junit.Test;

public class CommandTest {

	@Test
	public void test() throws Exception {
		ChainBase chainBase = init();
		Context context = new ParamContext();
		boolean result = chainBase.execute(context);
		System.out.println(result);
	}
	
	public ChainBase init() {
		ChainBase chainBase = new ChainBase();
		chainBase.addCommand(new ACommand());
		chainBase.addCommand(new BCommand());
		chainBase.addCommand(new CCommand());
		chainBase.addCommand(new DCommand());
		return chainBase;
	}
	
	public static void main(String[] args) {
		ParamContext context = new ParamContext();
		context.setParam("param");
		System.out.println(context.get("param"));
	}
}
