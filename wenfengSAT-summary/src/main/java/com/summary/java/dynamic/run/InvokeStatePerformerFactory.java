package com.summary.java.dynamic.run;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.summary.java.util.Result;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @Description： 功能描述
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2019年10月14日下午12:13:29]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Slf4j
public class InvokeStatePerformerFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(InvokeStatePerformerFactory.class);
	private static InvokeStatePerformerFactory instance = new InvokeStatePerformerFactory();
	private Map<InvokeState, InvokeStatePerformer> performers;

	private InvokeStatePerformerFactory() {
		performers = new HashMap<>();
		Method[] declaredMethods = getClass().getDeclaredMethods();
		for (Method method : declaredMethods) {
			if (method.getAnnotation(InterfaceMethod.class) != null) {
				try {
					InvokeStatePerformer invoke = (InvokeStatePerformer) method.invoke(this, new Object[] {});
					performers.put(invoke.getState(), invoke);
				} catch (Exception e) {
					LOGGER.error("", e);
				}
			}
		}
		performers = Collections.unmodifiableMap(performers);
	}

	public static InvokeStatePerformerFactory getInstance() {
		return instance;
	}

	public InvokeStatePerformer getInvokeStatePerformer(InvokeState state) throws Exception {
		InvokeStatePerformer invokeStatePerformer = performers.get(state);
		return invokeStatePerformer;
	}

	/**
	 * 支付宝支付
	 * 
	 * @return
	 */
	@InterfaceMethod
	private InvokeStatePerformer alipayPrecreate() {
		return new InvokeStatePerformer(InvokeState.alipayPrecreate) {
			@Override
			public <T> T perform(String requestStr) {
				// TODO 将requestStr转成requestObj对象，直接调用该processCode对应的服务...
				T result = (T) Result.ok();
				return result;
			}
		};
	}

}
