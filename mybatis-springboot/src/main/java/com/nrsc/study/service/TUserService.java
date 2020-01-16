package com.nrsc.study.service;


import com.nrsc.study.vo.UserAndSalaryVO;

/***
 * @author : Sun Chuan
 * @date : 2020/1/11
 * Description :
 */
public interface TUserService {
    UserAndSalaryVO selectByPrimaryKey(Integer id);
}
