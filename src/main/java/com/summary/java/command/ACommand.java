package com.summary.java.command;

import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component("ACommand")
public class ACommand implements FlowManageCommand {

	@Override
	public boolean execute(Context context) throws Exception {
		
		System.err.println("A...");
		return false;
	}

}
