package com.nrsc.study.service.impl;


import com.nrsc.study.domian.TSalary;
import com.nrsc.study.domian.TUser;
import com.nrsc.study.mapper.study.TUserMapper;
import com.nrsc.study.service.TUserService;
import com.nrsc.study.vo.UserAndSalaryVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @author : Sun Chuan
 * @date : 2020/1/11
 * Description :
 */
@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper userMapper;

    @Autowired
    private TSalaryServiceImpl salaryService;

    @Override
    public UserAndSalaryVO selectByPrimaryKey(Integer id) {
        //从mybatis-study数据库里获取用户信息
        TUser user = userMapper.selectByPrimaryKey(id);
        //从nrsc-mybatis数据库里获取用户的工资信息
        TSalary salary = salaryService.selectByUserName(user.getUserName());
        //封装数据并返回
        UserAndSalaryVO VO = new UserAndSalaryVO();
        BeanUtils.copyProperties(user,VO);
        VO.setSalary(salary);
        return VO;
    }
}
