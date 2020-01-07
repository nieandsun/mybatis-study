package com.nrsc.mybatis.mapper;

import com.nrsc.mybatis.domain.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TUserMapper {

    TUser selectByPrimaryKey(Integer id);

    List<TUser> selectListByIdList(@Param("list") List<Integer> idList);
}