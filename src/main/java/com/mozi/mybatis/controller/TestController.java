package com.mozi.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mozi.mybatis.modal.EdsPatient;
import com.mozi.mybatis.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping(value="/test")
	public Object test(){
		return testService.test();
	}
	
	@ResponseBody
	@RequestMapping(value="/findOne", method = RequestMethod.GET)
	public EdsPatient findOne(@RequestParam(value = "id") Integer id){
		return testService.findOne(id);
	}
	
}
