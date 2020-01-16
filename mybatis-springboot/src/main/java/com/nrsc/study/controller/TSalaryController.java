package com.nrsc.study.controller;

import com.nrsc.study.domian.TSalary;
import com.nrsc.study.service.TSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author : Sun Chuan
 * @date : 2020/1/16 10:04
 * Description: 
 */
@RestController
@RequestMapping("/salary")
public class TSalaryController {

    @Autowired
    private TSalaryService salaryService;

    @GetMapping(value = "/getSalary/{userName}", name = "根据userName查询用户工资")
    public TSalary selectByUserName(@PathVariable("userName") String userName) {
        return salaryService.selectByUserName(userName);
    }
}
