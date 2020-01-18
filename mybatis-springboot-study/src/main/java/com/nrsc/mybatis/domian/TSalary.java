package com.nrsc.mybatis.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class TSalary {

    private Long id;

    private String userName;

    private BigDecimal baseSalary;

    private BigDecimal postSalary;

    private BigDecimal mealAllowance;
}
