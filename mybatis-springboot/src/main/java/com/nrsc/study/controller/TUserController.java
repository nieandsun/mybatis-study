package com.nrsc.study.controller;

import com.nrsc.study.service.TUserService;
import com.nrsc.study.vo.UserAndSalaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author : Sun Chuan
 * @date : 2020/1/14 18:28
 * Description: 
 */
@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private TUserService userService;

    @GetMapping(value = "/getUser/{id}", name = "根据id查询用户")
    public UserAndSalaryVO selectByPrimaryKey(@PathVariable("id") Integer id) {
        return userService.selectByPrimaryKey(id);
    }
}
