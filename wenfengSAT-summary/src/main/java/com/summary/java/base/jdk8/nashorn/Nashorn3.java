package com.summary.java.base.jdk8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * 
 * @Description： Nashorn
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月9日下午4:14:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Nashorn3 {

    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("load('res/nashorn3.js')");
    }

}