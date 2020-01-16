package com.nrsc.study.mapper.nrsc;

import com.nrsc.study.domian.TSalary;

/***
 * @author : Sun Chuan
 * @date : 2020/1/16 9:25
 * Description: 
 */
public interface TSalaryMapper {
    TSalary selectByUserName(String userName);
}
