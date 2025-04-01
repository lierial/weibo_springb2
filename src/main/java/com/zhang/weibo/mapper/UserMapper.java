package com.zhang.weibo.mapper;

import com.zhang.weibo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUserById(int id);

    Integer checkUser(@Param("acc") String acc,@Param("psd") String psd);

    int checkUserExist(@Param("acc")String acc);

    void insertUser(User user);

}
