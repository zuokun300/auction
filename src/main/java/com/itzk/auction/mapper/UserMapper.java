package com.itzk.auction.mapper;

import java.util.List;

import com.itzk.auction.model.User;
import model.User;
import model.UserExample;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

}