package com.summary.java.base.jdk8.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Description： Streams
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2022年9月9日下午3:07:05]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Streams2 {

	public static void main(String[] args) {

		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");

		// sorting

		stringCollection.stream().sorted().forEach(System.out::println);

		System.out.println(stringCollection);

	}

}
