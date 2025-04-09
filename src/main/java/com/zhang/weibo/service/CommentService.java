package com.zhang.weibo.service;

import com.zhang.weibo.entity.Results;
import com.zhang.weibo.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommentService {

    @Autowired
    CommentMapper commentMapper;

    public Results getAllComment(Integer pid){
        return new Results(commentMapper.getAllComment(pid));
    }

    public Results addComment(Integer uid,Integer pid,String content){
        int row=commentMapper.addComment(uid,pid,content, LocalDateTime.now().toString());
        return new Results(row >0);
    }



}
