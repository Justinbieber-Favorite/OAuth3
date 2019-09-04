package com.example.demo.test.controller;


import com.example.demo.test.entity.Users;
import com.example.demo.test.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author app
 * @since 2019-09-04
 */
@Controller
public class UsersController {

    @Autowired(required = false)
    private UsersMapper usersMapper;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String loginPage(String username,String password){

        Users user = usersMapper.getUserByInformatin(username, password);
        if(user==null){
            return "不存在该用户";
        }
        else {
            return "登陆成功";
        }

    }

}
