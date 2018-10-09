package com.mozi.mybatis.service;

import com.mozi.mybatis.modal.EdsPatient;

public interface TestService {
	
	Object test();
	
	EdsPatient findOne(Integer id);
	
}
