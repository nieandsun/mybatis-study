package com.nrsc.study.service.impl;

import com.nrsc.study.domian.TSalary;
import com.nrsc.study.mapper.nrsc.TSalaryMapper;
import com.nrsc.study.service.TSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @author : Sun Chuan
 * @date : 2020/1/16 9:59
 * Description: 
 */
@Service
public class TSalaryServiceImpl implements TSalaryService {
    @Autowired
    private TSalaryMapper salaryMapper;

    @Override
    public TSalary selectByUserName(String userName) {
        return salaryMapper.selectByUserName(userName);
    }
}
