package com.mozi.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mozi.mybatis.mapper.EdsPatientMapper;
import com.mozi.mybatis.modal.EdsPatient;
import com.mozi.mybatis.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private EdsPatientMapper edsPatientMapper;

	@Override
	public Object test() {
		return edsPatientMapper.selectMap();
	}

	@Override
	public EdsPatient findOne(Integer id) {
		return edsPatientMapper.selectByPrimaryKey(id);
	}

}
