package com.babbot.coin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.babbot.coin.service.impl.TestServiceImpl;
import com.babbot.coin.vo.TestVO;

@RestController
public class CoinController {
	
	@Autowired
	TestServiceImpl testServiceImpl;
	
	@GetMapping("/test/lists")
	public @ResponseBody List<TestVO> getTestList(){
		return testServiceImpl.getTestList();
	}

}
