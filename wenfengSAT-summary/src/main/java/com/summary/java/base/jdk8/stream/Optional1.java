package com.summary.java.base.jdk8.stream;

import java.util.Optional;

/**
 * 
 * @Description： Optional
 * 
 * @author [ Wenfeng.Huang ] on [2022年9月9日下午3:04:03]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class Optional1 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");

        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }

}