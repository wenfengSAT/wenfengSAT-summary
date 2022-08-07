package com.summary.java.command;

import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component("BCommand")
public class BCommand implements FlowManageCommand {

	@Override
	public boolean execute(Context context) throws Exception {
		
		System.err.println("B...");
		return false;
	}

}
