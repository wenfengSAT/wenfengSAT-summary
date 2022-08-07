package com.summary.java.command;

import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParamContext extends ContextBase implements Context {
	
	private static final long serialVersionUID = 1L;
	
	private String param;

}
