package com.mozi.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.mozi.mybatis.modal.EdsPatient;

/**
 * 
 * @ClassName:EdsPatientMapper
 * @Description: EdsPatient持久层接口
 * @author liyue
 * @date 2018年6月25日上午10:12:45
 */
public interface EdsPatientMapper {
	
    int deleteByPrimaryKey(Integer patientId);

    int insert(EdsPatient record);

    int insertSelective(EdsPatient record);

    EdsPatient selectByPrimaryKey(Integer patientId);

    int updateByPrimaryKeySelective(EdsPatient record);

    int updateByPrimaryKey(EdsPatient record);
    
	List<Map<String,Object>> selectAll();
	
	List<Map<String,Object>> selectMap();
    
    List<EdsPatient> selectByPatientName(String name);
    
}