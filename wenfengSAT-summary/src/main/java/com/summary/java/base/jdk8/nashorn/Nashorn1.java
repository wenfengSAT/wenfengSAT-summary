package com.summary.java.base.jdk8.nashorn;


import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import com.summary.java.base.jdk8.lambda.Person;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 * @Description： Nashorn
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月9日下午4:14:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Nashorn1 {

	public static void main(String[] args) throws Exception {
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		engine.eval(new FileReader("res/nashorn1.js"));

		Invocable invocable = (Invocable) engine;
		Object result = invocable.invokeFunction("fun1", "Peter Parker");
		System.out.println(result);
		System.out.println(result.getClass());

		invocable.invokeFunction("fun2", new Date());
		invocable.invokeFunction("fun2", LocalDateTime.now());
		invocable.invokeFunction("fun2", new Person());
	}

}