package com.zhang.weibo.controller;


import com.zhang.weibo.entity.Post;
import com.zhang.weibo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/add")
    public String insertPost(){
        Post post = new Post(100001,"我的世界","这是我的第一篇帖子","");
        postService.insertPost(post);
        return "success";
    }

}
