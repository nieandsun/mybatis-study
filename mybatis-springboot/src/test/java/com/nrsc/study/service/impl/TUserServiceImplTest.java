package com.nrsc.study.service.impl;

import com.nrsc.study.domian.TUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/***
 * @author : Sun Chuan
 * @date : 2020/1/14 17:48
 * Description: 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class TUserServiceImplTest {


    @Autowired
    private TUserServiceImpl userService;

    @Test
    void selectByPrimaryKey() {

        TUser tUser = userService.selectByPrimaryKey(1);

        assertNotNull(tUser);
    }
}