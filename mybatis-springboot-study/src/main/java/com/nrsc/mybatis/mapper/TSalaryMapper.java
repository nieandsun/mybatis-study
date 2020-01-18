package com.nrsc.mybatis.mapper;


import com.nrsc.mybatis.domian.TSalary;

/***
 * @author : Sun Chuan
 * @date : 2020/1/16 9:25
 * Description: 
 */
public interface TSalaryMapper {
    TSalary selectByUserName(String userName);
}
