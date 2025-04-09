package com.zhang.weibo.controller;

import com.zhang.weibo.entity.Results;
import com.zhang.weibo.entity.User;
import com.zhang.weibo.mapper.UserMapper;
import com.zhang.weibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get/{id}")
    public Results getUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/login")
    public Results checkUser(@RequestParam("acc") String acc,@RequestParam("psd") String psd){
        return userService.checkUser(acc,psd);
    }

    /*
    * 前端发送格式：
    * {
        "name":"用户123",
        "acc":"zhanghao",
        "psd":"mima"
        }
    * */
    @PostMapping("/insert")
    public Results insertUser(@RequestParam("name") String name,@RequestParam("acc") String acc,@RequestParam("psd") String psd){
        User user = new User(name,acc,psd);
        return userService.insertUser(user);
    }

    @GetMapping("/follower/{id}")
    public Results getFollowersByUser(@PathVariable Integer id){
        return userService.getFollowersByUser(id);
    }

    @GetMapping("/followee/{id}")
    public Results getFolloweesByUser(@PathVariable Integer id){
        return userService.getFolloweesByUser(id);
    }

    @PostMapping("/follow/add")
    public Results followUser(
            @RequestParam("uid") Integer uid,
            @RequestParam("fid") Integer fid
    ){
        return userService.followUser(uid,fid);
    }

    @PostMapping("/follow/delete")
    public Results disFollowUser(
            @RequestParam("uid") Integer uid,
            @RequestParam("fid") Integer fid
    ){
        return userService.disFollowUser(uid,fid);
    }
}
