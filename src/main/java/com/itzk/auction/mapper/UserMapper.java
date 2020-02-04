package com.itzk.auction.mapper;


import com.itzk.auction.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into users(u_id,u_name,u_pass,u_gender,u_phone)values(#{id},#{uName},#{uPass},#{uGender},#{uPhone})")
    int insert(User user);


    int insertSelective(User record);

    @Select("select * from users where u_name=#{uName} and u_pass=#{uPass}")
    User doLogin(@Param("uName") String uName,@Param("uPass") String uPass);
}