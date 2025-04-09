package com.zhang.weibo.controller;

import com.zhang.weibo.entity.Results;
import com.zhang.weibo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/all/{id}")
    public Results getAllComment(@PathVariable Integer id){
        return commentService.getAllComment(id);
    }

    @PostMapping("/add")
    public Results addComment(
            @RequestParam("uid") Integer uid,
            @RequestParam("pid") Integer pid,
            @RequestParam("content") String content
    ){
        return commentService.addComment(uid,pid,content);
    }

}
