package com.summary.java.dynamic.run;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @Description： 功能描述
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2019年10月14日下午12:12:41]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface InterfaceMethod {
}
