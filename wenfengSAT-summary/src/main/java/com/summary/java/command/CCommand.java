package com.summary.java.command;

import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component("CCommand")
public class CCommand implements FlowManageCommand {

	@Override
	public boolean execute(Context context) throws Exception {
		
		System.err.println("C...");
		return false;
	}

}
