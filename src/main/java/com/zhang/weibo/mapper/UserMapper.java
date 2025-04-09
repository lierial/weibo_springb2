package com.zhang.weibo.mapper;

import com.zhang.weibo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUserById(int id);

    Integer checkUser(@Param("acc") String acc,@Param("psd") String psd);

    int checkUserExist(@Param("acc") String acc);

    void insertUser(User user);

    List<User> getFollowersByUser(@Param("uid") Integer uid);

    List<User> getFolloweesByUser(@Param("uid") Integer uid);

    int followUser(@Param("uid") Integer uid,@Param("fid") Integer fid,@Param("time") String time);
    int disFollowUser(@Param("uid") Integer uid,@Param("fid") Integer fid);

}
