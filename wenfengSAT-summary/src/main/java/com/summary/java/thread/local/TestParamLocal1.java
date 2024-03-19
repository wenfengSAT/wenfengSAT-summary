package com.summary.java.thread.local;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TestParamLocal1 {

	private String param1;
	private int param2;
}
