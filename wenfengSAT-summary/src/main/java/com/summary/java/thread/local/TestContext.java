package com.summary.java.thread.local;

import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(chain = true)
public class TestContext {

	private final TestParamLocal1 Local1 = new TestParamLocal1();

	private final TestParamLocal2 Local2 = new TestParamLocal2();
}
