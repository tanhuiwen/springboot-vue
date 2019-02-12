//package com.sue.springbootvue.controller;
//
//import com.sue.springbootvue.entity.User;
//import com.sue.springbootvue.result.ResultFactory;
//import com.sue.springbootvue.service.impl.UserServiceImpl;
//import com.sue.springbootvue.utils.JwtUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.HashMap;
//
//@RestController
//@CrossOrigin
//public class LoginController {
//    private UserServiceImpl userServiceImpl;
//
//    @Autowired
//    public LoginController(UserServiceImpl userServiceImpl) {
//        this.userServiceImpl = userServiceImpl;
//    }
//
//    @PostMapping("/login")
//    public Object login(HttpServletResponse response, @RequestParam String phoneNumber, @RequestParam String password) throws IOException {
//        if (!userServiceImpl.isExistByPhoneNumber(phoneNumber)) {
//            return ResultFactory.buildFailResult("不存在该手机号码");
//        } else if (!userServiceImpl.getUserByPhoneNumber(phoneNumber).getPassword().equals("password")) {
//            return ResultFactory.buildFailResult("密码错误");
//        } else {
//            User user = userServiceImpl.getUserByPhoneNumber(phoneNumber);
//            String jwt = JwtUtils.generateToken(user.getId(), user.getUsername());
//            return new HashMap<String, String>() {{
//                put("token", jwt);
//            }};
//        }
//
//    }
//}
