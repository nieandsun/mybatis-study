package com.nrsc.mybatis.mapper;

import com.nrsc.mybatis.domian.TJobHistory;

import java.util.List;

public interface TJobHistoryMapper {

    List<TJobHistory> selectByUserId(Long userId);
}
