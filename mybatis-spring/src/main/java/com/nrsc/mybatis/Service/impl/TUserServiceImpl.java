package com.nrsc.mybatis.Service.impl;

import com.nrsc.mybatis.Service.TUserService;
import com.nrsc.mybatis.domian.TUser;
import com.nrsc.mybatis.mapper.TUserMapper;
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

    @Override
    public TUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
