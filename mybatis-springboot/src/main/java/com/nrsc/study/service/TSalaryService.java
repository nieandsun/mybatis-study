package com.nrsc.study.service;

import com.nrsc.study.domian.TSalary;

/***
 * @author : Sun Chuan
 * @date : 2020/1/16 9:59
 * Description: 
 */
public interface TSalaryService {
    TSalary selectByUserName(String userName);
}
