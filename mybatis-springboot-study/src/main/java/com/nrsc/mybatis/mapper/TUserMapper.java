package com.nrsc.mybatis.mapper;

import com.nrsc.mybatis.vo.UserAndJobHistoryVO;
import com.nrsc.mybatis.vo.UserAndSalaryVO;

import java.util.List;

public interface TUserMapper {

    UserAndSalaryVO selectUserAndSalaryByPrimaryKey(Long id);

    List<UserAndSalaryVO> getAllUserInfo();

    UserAndJobHistoryVO getUserAndJobsInfo(Long userId);

    UserAndJobHistoryVO getUserAndJobsInfoLazy(Long userId);
}