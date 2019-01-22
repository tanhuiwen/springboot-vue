package com.sue.springbootvue.controller;

import com.sue.springbootvue.entity.User;
import com.sue.springbootvue.repository.UserRepository;
import com.sue.springbootvue.result.Result;
import com.sue.springbootvue.result.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
    private UserRepository userRepository;
    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository=userRepository;
    }

//    @PostMapping (value = "/login",produces = "application/json; charset=UTF-8")
//    public Result login(@RequestBody User user){
//        if(user==null){
//            return ResultFactory.buildFailResult(String.format("登录失败，详细信息‘接收对象为空’"));
//        }
//        else if (userRepository.getByUsernameIs(user.getUsername())==null){
//           if (userRepository.getByPhoneNumberIs(user.getUsername())==null){
//               return ResultFactory.buildFailResult(String.format("登录失败，详细信息‘不存在该对象’"));
//           }
//
//           else if (!userRepository.getByPhoneNumberIs(user.getUsername()).getPassword().equals(user.getPassword())){
//               return ResultFactory.buildFailResult(String.format("登录失败，详细信息‘密码错误’"));
//           }
//
//           else return ResultFactory.buildSuccessResult(userRepository.getByPhoneNumberIs(user.getUsername()));
//        }
//        else if (!userRepository.getByUsernameIs(user.getUsername()).getPassword().equals(user.getPassword())) {
//            return ResultFactory.buildFailResult(String.format("登录失败，详细信息‘密码错误’"));
//        }
//        else return ResultFactory.buildSuccessResult(userRepository.getByUsernameIs(user.getUsername()));
//    }
    @PostMapping(value = "/user", produces = "application/json; charset=UTF-8")
    public Result insertuser(@RequestBody User user){
        if(user==null){
            return ResultFactory.buildFailResult(String.format("添加失败，详细信息‘接收对象为空’"));
        }
        else {
//            user u = new user();
//            u.setUsername(user.getUsername());
//            u.setPassword(user.getPassword());
//            u.setPhoneNumber(user.getPhoneNumber());
//            u.setEmail(user.getEmail());
//            u.setDepartment(user.getDepartment());
            userRepository.save(user);
            return ResultFactory.buildSuccessResult(user);
        }
    }
    @DeleteMapping(value = "/user/{id}", produces = "application/json; charset=UTF-8")
    public Result deleteUser(@PathVariable("id") int id){
            userRepository.delete(id);
            return ResultFactory.buildSuccessResult("删除成功");

    }
//    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
//    public Result update(@RequestBody user user){
//        if (user==null){
//            return ResultFactory.buildFailResult(String.format("更新失败，详细信息‘接收对象为空’"));
//        }
//        else if (user.getPassword()!=null){
//
//        }
//    }

}
