package com.nrsc.mybatis.mapper;

import com.nrsc.mybatis.domain.TUser;

public interface TUserMapper {

    TUser selectByPrimaryKey(Integer id);
}