package com.summary.java.base.jdk8.nashorn;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.Invocable;
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
public class Nashorn6 {

    public static void main(String[] args) throws Exception {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("load('res/nashorn6.js')");

        Invocable invocable = (Invocable) engine;

        Product product = new Product();
        product.setName("Rubber");
        product.setPrice(1.99);
        product.setStock(1337);

        ScriptObjectMirror result = (ScriptObjectMirror)
                invocable.invokeFunction("calculate", product);
        System.out.println(result.get("name") + ": " + result.get("valueOfGoods"));
    }

    public static void getProduct(ScriptObjectMirror result) {
        System.out.println(result.get("name") + ": " + result.get("valueOfGoods"));
    }

}