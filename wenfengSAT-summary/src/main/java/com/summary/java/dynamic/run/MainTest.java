package com.summary.java.dynamic.run;



import com.summary.java.util.Result;

import cn.hutool.json.JSONUtil;



public class MainTest {

	public static <T> void main(String[] args) throws Exception {
		InvokeState processCode = InvokeState.valueOf("alipayPrecreate");
		String requestStr = "{}";
		Result result = InvokeStatePerformerFactory.getInstance().getInvokeStatePerformer(processCode).perform(requestStr);
		System.out.println(JSONUtil.toJsonStr(result));
		//@Autowired
		//private InvokeResultService invokeResultService;
		//InvokeState1 processCode1 = InvokeState1.valueOf("alipayPrecreate");
		//invokeResultService.result(processCode1, requestStr);
	}
}
