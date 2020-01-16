package com.nrsc.study.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2020/1/16 9:20
 * Description: 
 */
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
