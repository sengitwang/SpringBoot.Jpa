package com.springboot.mybatis.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.springboot.mybatis.demo.model.User;
import com.springboot.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by sen on 2016/8/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryUser() {
        return userService.queryUser();
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(@RequestBody JSONObject jsonObject) {
        User user=new User();
        user.setName(jsonObject.get("name").toString());
        user.setAge(Integer.valueOf(jsonObject.get("age").toString()));
        try {
            userService.saveUser(user);
            return "成功";
        }catch (Exception e){
            return "失败";
        }
    }
}
