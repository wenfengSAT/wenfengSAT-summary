package com.summary.java.dynamic.run;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.hutool.core.util.ReflectUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @Description： Lion远程服务调用
 * 
 * @author [ Wenfeng.Huang@desay-svautomotive.com ] on [2019年10月10日上午10:52:15]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
@Slf4j
@Component
public class InvokeResultService<T> {

	//@Value("${dubbo.application.name}")
	private String applicationName;
	//@Value("${dubbo.registry.id}")
	private String registryId;
	//@Value("${dubbo.registry.address}")
	private String registryAddress;

	/**
	 * 
	 * @Description： 远程服务调用
	 * 
	 * @author [ Wenfeng.Huang@desay-svautomotive.com ]
	 * @Date [2019年10月9日下午4:52:45]
	 * @param invokeState
	 * @param requestStr
	 * @return
	 * @throws Exception
	 *
	 */
	public <T> T result(InvokeState1 invokeState, String requestStr) throws Exception {
		long begin = System.currentTimeMillis();
		JSONObject reqJson = JSON.parseObject(requestStr);
		T result = null;
		T service = getDubboService(invokeState.version, invokeState.service);
		if (Objects.isNull(invokeState.reqObj)) {
			result = ReflectUtil.invoke(service, invokeState.method);
		} else {
			Object reqObj = JSON.toJavaObject(reqJson, invokeState.reqObj);
			result = ReflectUtil.invoke(service, invokeState.method, reqObj);
		}
		log.info("{} 耗时：{}", invokeState.desc, System.currentTimeMillis() - begin);
		if (log.isDebugEnabled()) {
			log.debug("{} result:{}", invokeState.method, JSON.toJSONString(result));
		}
		return result;
	}

	/**
	 * 
	 * @Description： 动态获取dubbo远程服务
	 * 
	 * @author [ Wenfeng.Huang@desay-svautomotive.com ]
	 * @Date [2019年10月9日下午4:52:17]
	 * @param version
	 * @param interfaceClass
	 * @return
	 *
	 */
	public <T> T getDubboService(String version, Class<?> interfaceClass) {
		ApplicationConfig application = new ApplicationConfig();
		application.setName(applicationName);
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(registryAddress);
		ReferenceConfig<T> rc = new ReferenceConfig<T>();
		rc.setApplication(application);
		rc.setInterface(interfaceClass);
		rc.setId(registryId);
		rc.setTimeout(60000);// 超时时间
		rc.setRetries(-1);// 重试次数
		rc.setVersion(version);
		return rc.get();
	}

}
