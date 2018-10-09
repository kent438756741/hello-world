package com.mozi.mybatis.mapper;

import com.mozi.mybatis.modal.EdsLisDetail;
import java.math.BigDecimal;

public interface EdsLisDetailMapper {
    int deleteByPrimaryKey(BigDecimal lisDetailId);

    int insert(EdsLisDetail record);

    int insertSelective(EdsLisDetail record);

    EdsLisDetail selectByPrimaryKey(BigDecimal lisDetailId);

    int updateByPrimaryKeySelective(EdsLisDetail record);

    int updateByPrimaryKey(EdsLisDetail record);
}