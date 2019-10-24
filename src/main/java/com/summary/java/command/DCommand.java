package com.summary.java.command;

import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component("DCommand")
public class DCommand implements FlowManageCommand {

	@Override
	public boolean execute(Context context) throws Exception {
		
		System.err.println("D...");
		return false;
	}

}
