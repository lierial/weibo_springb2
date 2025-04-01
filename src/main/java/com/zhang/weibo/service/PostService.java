package com.zhang.weibo.service;

import com.zhang.weibo.entity.Post;
import com.zhang.weibo.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class PostService {

    @Autowired
    PostMapper postMapper;

    public void insertPost(Post post){
        post.setCreated(LocalDateTime.now().toString());
        postMapper.insertPost(post);
    }
}
