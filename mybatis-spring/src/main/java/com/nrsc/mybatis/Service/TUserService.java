package com.nrsc.mybatis.Service;

import com.nrsc.mybatis.domian.TUser;

/***
 * @author : Sun Chuan
 * @date : 2020/1/11
 * Description :
 */
public interface TUserService {
    TUser selectByPrimaryKey(Integer id);
}
