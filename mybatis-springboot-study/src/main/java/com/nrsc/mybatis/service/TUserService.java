package com.nrsc.mybatis.service;

import com.nrsc.mybatis.vo.UserAndJobHistoryVO;
import com.nrsc.mybatis.vo.UserAndSalaryVO;

import java.util.List;

public interface TUserService {
    /***1对1，非懒加载*/
    UserAndSalaryVO selectUserAndSalaryByPrimaryKey(Long id);

    /***1对1，懒加载*/
    List<UserAndSalaryVO> getAllUserInfo();

    /***1对多，非懒加载
     * @return*/
    UserAndJobHistoryVO getUserAndJobsInfo(Long userId);

    /***1对多，懒加载
     * @return*/
    UserAndJobHistoryVO getUserAndJobsInfoLazy(Long userId);
}
