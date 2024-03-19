package com.summary.java.base.jdk8.stream;

import java.util.Arrays;

/**
 * 
 * @Description： Streams
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月9日下午3:07:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Streams9 {

	public static void main(String[] args) {
		Arrays.asList("a1", "a2", "b1", "c2", "c1").stream()
		.filter(s -> s.startsWith("c"))
		.map(String::toUpperCase)
		.sorted().forEach(System.out::println);

		// C1
		// C2
	}
}
