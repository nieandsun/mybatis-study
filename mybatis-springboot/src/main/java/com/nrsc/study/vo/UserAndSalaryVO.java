package com.nrsc.study.vo;

import com.nrsc.study.domian.TSalary;
import com.nrsc.study.domian.TUser;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/***
 * @author : Sun Chuan
 * @date : 2020/1/16 9:32
 * Description: 
 */
@ToString
@Setter
@Getter
public class UserAndSalaryVO extends TUser {

    private TSalary salary;
}
