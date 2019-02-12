package com.sue.springbootvue.service;

import com.sue.springbootvue.entity.User;

import java.util.List;

public interface UserService {
    public boolean isExistByPhoneNumber(String phoneNumber);

    public User getUserByPhoneNumber(String phoneNumber);

    public User addUser(User user);

    public boolean deleteUser(Integer id);

    public User updateUser(User user);

    public User getOne(Integer id);

    public List<User> findAll();
}
