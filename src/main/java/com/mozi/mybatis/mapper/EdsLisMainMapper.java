package com.mozi.mybatis.mapper;

import com.mozi.mybatis.modal.EdsLisMain;
import java.math.BigDecimal;

public interface EdsLisMainMapper {
    int deleteByPrimaryKey(BigDecimal lisId);

    int insert(EdsLisMain record);

    int insertSelective(EdsLisMain record);

    EdsLisMain selectByPrimaryKey(BigDecimal lisId);

    int updateByPrimaryKeySelective(EdsLisMain record);

    int updateByPrimaryKey(EdsLisMain record);
}