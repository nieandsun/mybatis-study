package com.nrsc.mybatis.service.impl;


import com.nrsc.mybatis.domian.TSalary;
import com.nrsc.mybatis.mapper.TUserMapper;
import com.nrsc.mybatis.service.TUserService;
import com.nrsc.mybatis.vo.UserAndJobHistoryVO;
import com.nrsc.mybatis.vo.UserAndSalaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @author : Sun Chuan
 * @date : 2020/1/11
 * Description :
 */
@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public UserAndSalaryVO selectUserAndSalaryByPrimaryKey(Long id) {
        //从mybatis-study数据库里获取用户信息
        UserAndSalaryVO VO = userMapper.selectUserAndSalaryByPrimaryKey(id);
        return VO;
    }

    @Override
    public List<UserAndSalaryVO> getAllUserInfo() {
        //从mybatis-study数据库里获取用户信息
        List<UserAndSalaryVO> VOs = userMapper.getAllUserInfo();
        TSalary salary = VOs.get(0).getSalary();
        return VOs;
    }

    @Override
    public UserAndJobHistoryVO getUserAndJobsInfo(Long userId) {
        UserAndJobHistoryVO VO = userMapper.getUserAndJobsInfo(userId);
        return VO;
    }

    @Override
    public UserAndJobHistoryVO getUserAndJobsInfoLazy(Long userId) {
        UserAndJobHistoryVO VO = userMapper.getUserAndJobsInfoLazy(userId);
        return VO;
    }
}
