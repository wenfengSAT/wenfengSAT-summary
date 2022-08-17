package com.summary.spring.validate;

import java.util.Map;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.summary.spring.R;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/validate")
public class TestController {

	@PostMapping("/test")
	public R<TestResp> create(@Validated @RequestBody TestReq req, @RequestHeader Map<String, Object> headers) {
		return R.ok();
	}
}
