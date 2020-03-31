package com.summary.java.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.summary.java.base.enumerate.ErrorCode;
import com.summary.java.util.Result;

/**
 * 
 * @Description： 异步线程
 * 
 * @author [ Wenfeng.Huang ] on [2020年3月31日下午4:13:20]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class CompletableFutureTest {

	@Test
	public void test1() throws Exception {
		CompletableFuture<String> completableFuture = new CompletableFuture<String>();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					TimeUnit.SECONDS.sleep(3);
					System.out.println("执行.....");
					completableFuture.complete("success");// 在子线程中完成主线程completableFuture的完成

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();// 启动子线程

		String result = completableFuture.get();// 主线程阻塞，等待完成
		System.out.println("1x:  " + result);
	}

	@Test
	public void test2() throws Exception {
		Result result = returnData();
		System.err.println(JSON.toJSONString(result));
	}

	public Result returnData() {
		ExecutorService exec = Executors.newFixedThreadPool(1);
		try {
			CompletableFuture<Result> result = CompletableFuture.supplyAsync(() -> {
				return service();
			}, exec);
			return result.get(1000, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
			return Result.error(ErrorCode.PARAMETER_ERROR);
		} finally {
			// 关闭线程池
			exec.shutdown();
		}
	}

	/**
	 * 
	 * @Description： service实现
	 * 
	 * @author [ Wenfeng.Huang ]
	 * @Date [2020年3月31日下午4:29:56]
	 * @return
	 *
	 */
	public Result service() {
		return new Result();
	}

}
