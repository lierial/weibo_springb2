package com.zhang.weibo.controller;


import com.zhang.weibo.entity.Post;
import com.zhang.weibo.entity.Results;
import com.zhang.weibo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/follows/{id}")
    public Results getFollowsPosts(@PathVariable Integer id,@RequestParam(value = "page") Integer page){
        return postService.getFollowsPosts(id,page);
    }

    @GetMapping("/search/{id}")
    public Results searchPosts(@PathVariable Integer id,@RequestParam(value = "text") String text){
        return postService.searchPosts(id,text);
    }

    @PostMapping("/add")
    public Results addPost(
            @RequestParam("uid") Integer uid,@RequestParam("tag") String tag,
            @RequestParam("content") String content,@RequestParam("images") String images){
        Post post = new Post(uid,tag,content,images);
        //postService.insertPost(post);
        return postService.addPost(post);
    }

    @PostMapping("/like")
    public Results likePost(@RequestParam("uid") Integer uid,@RequestParam("pid") Integer pid){
        return postService.likePost(uid,pid);
    }

    @PostMapping("/dlike")
    public void likeDelete(@RequestParam("uid") Integer uid,@RequestParam("pid") Integer pid){
        postService.likeDelete(uid,pid);
    }

    @GetMapping("/recommend/{id}")
    public Results recommendPosts(@PathVariable Integer id){
        return postService.recommendPosts(id);
    }

    @GetMapping("/my/{id}")
    public Results getPostsByUser(@PathVariable Integer id){
        return postService.getPostsByUser(id);
    }
}
