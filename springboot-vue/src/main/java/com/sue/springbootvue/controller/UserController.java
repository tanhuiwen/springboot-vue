package com.sue.springbootvue.controller;

import com.sue.springbootvue.entity.User;
import com.sue.springbootvue.result.Result;
import com.sue.springbootvue.result.ResultFactory;
import com.sue.springbootvue.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    private UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping(value = "/user")
    public Result addUser(@RequestBody User user) {
        if (userServiceImpl.isExistByPhoneNumber(user.getPhoneNumber())) {
            return ResultFactory.buildFailResult("该手机号码已存在");
        } else {
            return ResultFactory.buildSuccessResult(userServiceImpl.addUser(user));
        }
    }

    @DeleteMapping(value = "/user/{id}")
    public Result deleteUsr(@PathVariable Integer id) {
        return ResultFactory.buildSuccessResult(userServiceImpl.deleteUser(id));
    }

    @PatchMapping(value = "/user")
    public Result updateUser(@RequestBody User user) {
        return ResultFactory.buildSuccessResult(userServiceImpl.updateUser(user));
    }

    @GetMapping(value = "/user/{id}")
    public Result getUser(@PathVariable Integer id) {
        User user = userServiceImpl.getOne(id);
        return ResultFactory.buildSuccessResult(user);
    }

    @GetMapping(value = "/users")
    public Result getAll() {
        List<User> users = userServiceImpl.findAll();
        return ResultFactory.buildSuccessResult(users);
    }
}
