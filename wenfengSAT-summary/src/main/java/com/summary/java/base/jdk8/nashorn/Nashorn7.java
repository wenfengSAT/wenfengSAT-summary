package com.summary.java.base.jdk8.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 
 * @Description： Nashorn
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月9日下午4:14:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Nashorn7 {

    public static class Person {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLengthOfName() {
            return name.length();
        }
    }

    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("function foo(predicate, obj) { return !!(eval(predicate)); };");

        Invocable invocable = (Invocable) engine;

        Person person = new Person();
        person.setName("Hans");

        String predicate = "obj.getLengthOfName() >= 4";
        Object result = invocable.invokeFunction("foo", predicate, person);
        System.out.println(result);
    }

}
