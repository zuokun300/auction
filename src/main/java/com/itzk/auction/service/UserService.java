package com.itzk.auction.service;

import com.itzk.auction.mapper.UserMapper;
import com.itzk.auction.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;


    public User doLogin(String uName, String uPass) {
        User user = userMapper.doLogin(uName,uPass);
        return user;
    }


}
