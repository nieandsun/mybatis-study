package com.nrsc.mybatis.controller;


import com.nrsc.mybatis.service.TUserService;
import com.nrsc.mybatis.vo.UserAndJobHistoryVO;
import com.nrsc.mybatis.vo.UserAndSalaryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class TUserController {

    @Autowired
    private TUserService userService;


    //-----------------1对1-----------------------------------------------------------------

    /***
     * 非懒加载的方式
     * @param id
     * @return
     */
    @GetMapping(value = "/getUser/{id}", name = "根据id查询用户")
    public UserAndSalaryVO selectUserAndSalaryByPrimaryKey(@PathVariable("id") Long id) {
        return userService.selectUserAndSalaryByPrimaryKey(id);
    }

    /***
     * 懒加载的方式
     * @return
     */
    @GetMapping(value = "/getAllUserInfo", name = "查询所有的用户信息+工资信息")
    public List<UserAndSalaryVO> getAllUserInfo() {
        return userService.getAllUserInfo();
    }
    //-----------------1对1------------------------------------------------------------------

    //-----------------1对多------------------------------------------------------------------

    /***
     * 非懒加载的方式
     * @return
     */
    @GetMapping(value = "/getUserAndJobsInfo/{userId}", name = "查询所有的用户信息+工作历史信息")
    public UserAndJobHistoryVO getUserAndJobsInfo(@PathVariable Long userId) {
        return userService.getUserAndJobsInfo(userId);
    }

    /***
     * 懒加载的方式
     * @return
     */
    @GetMapping(value = "/getUserAndJobsInfoLazy/{userId}", name = "查询所有的用户信息+工作历史信息")
    public UserAndJobHistoryVO getUserAndJobsInfoLazy(@PathVariable Long userId) {
        return userService.getUserAndJobsInfoLazy(userId);
    }

    //-----------------1对多------------------------------------------------------------------


}
