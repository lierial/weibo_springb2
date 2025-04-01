package com.zhang.weibo.service;

import com.zhang.weibo.entity.Results;
import com.zhang.weibo.entity.User;
import com.zhang.weibo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Results getUserById(int id) {
        return new Results(userMapper.getUserById(id));
    }

    public Results insertUser(User user){
        // 这里可以设置用户密码的加密方式
        user.setCreated(LocalDateTime.now().toString());
        if(userMapper.checkUserExist(user.getAccount()) > 0){
            return new Results(401,"已存在的账号，可直接前往登录");
        }else{
            userMapper.insertUser(user);
            return new Results(null);
        }
    }

    public Results checkUser(String acc, String psd){
        Integer userId = userMapper.checkUser(acc,psd);
        Results results;
        if(userId != null){
            User user = userMapper.getUserById(userId);
            user.setPassword("********");
            results = new Results(user);
        }else{
            results = new Results(404,"未找到该用户，请检查账号密码");
        }
        return results;
    }
}
