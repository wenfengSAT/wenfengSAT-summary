package com.summary.java.base.jdk8.nashorn;

import jdk.nashorn.api.scripting.NashornScriptEngine;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @Description： Nashorn
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月9日下午4:14:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Nashorn9 {

	public static void main(String[] args) throws ScriptException, NoSuchMethodException {
		NashornScriptEngine engine = (NashornScriptEngine) new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval("load('res/nashorn9.js')");

		long t0 = System.nanoTime();

		double result = 0;
		for (int i = 0; i < 1000; i++) {
			double num = (double) engine.invokeFunction("testPerf");
			result += num;
		}

		System.out.println(result > 0);

		long took = System.nanoTime() - t0;
		System.out.format("Elapsed time: %d ms", TimeUnit.NANOSECONDS.toMillis(took));
	}
}
