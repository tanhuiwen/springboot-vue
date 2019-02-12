package com.sue.springbootvue.service.impl;

import com.sue.springbootvue.entity.User;
import com.sue.springbootvue.repository.UserRepository;
import com.sue.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean isExistByPhoneNumber(String phoneNumber) {
        User u = null;
        u = userRepository.getByPhoneNumberIs(phoneNumber);
        if (u != null)
            return true;
        else return false;
    }

    @Override
    public User getUserByPhoneNumber(String phoneNumber) {
        User user = userRepository.getByPhoneNumberIs(phoneNumber);
        return user;
    }


    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean deleteUser(Integer id) {
        userRepository.delete(id);
        return true;
    }

    @Override
    public User updateUser(User user) {
        if (user.getPassword() != null)
            userRepository.updatePassword(user.getId(), user.getPassword());
        if (user.getPhoneNumber() != null)
            userRepository.updatephoneNumber(user.getId(), user.getPhoneNumber());
        if (user.getEmail() != null)
            userRepository.updateEmail(user.getId(), user.getEmail());
        return userRepository.getOne(user.getId());
    }

    @Override
    public User getOne(Integer id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
