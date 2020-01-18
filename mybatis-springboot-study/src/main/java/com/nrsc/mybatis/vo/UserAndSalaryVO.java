package com.nrsc.mybatis.vo;


import com.nrsc.mybatis.domian.TSalary;
import com.nrsc.mybatis.domian.TUser;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class UserAndSalaryVO extends TUser {

    //@JsonIgnore
    private TSalary salary;
}
