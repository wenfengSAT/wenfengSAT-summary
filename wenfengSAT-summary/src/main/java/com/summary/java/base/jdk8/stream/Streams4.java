package com.summary.java.base.jdk8.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 
 * @Description： Streams
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月9日下午3:07:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Streams4 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		IntStream.range(0, 10).forEach(i -> {
			if (i % 2 == 1)
				System.out.println(i);
		});

		IntStream.range(0, 10).filter(i -> i % 2 == 1).forEach(System.out::println);

		OptionalInt reduced1 = IntStream.range(0, 10).reduce((a, b) -> a + b);
		System.out.println(reduced1.getAsInt());

		int reduced2 = IntStream.range(0, 10).reduce(7, (a, b) -> a + b);
		System.out.println(reduced2);
	}
}
