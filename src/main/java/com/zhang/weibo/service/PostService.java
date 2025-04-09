package com.zhang.weibo.service;

import com.zhang.weibo.entity.Post;
import com.zhang.weibo.entity.Results;
import com.zhang.weibo.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {

    @Autowired
    PostMapper postMapper;

   public Results getFollowsPosts(Integer uid,Integer page){
       List<Post> posts = postMapper.getFollowsPosts(uid,page);
       return new Results(posts);
   }

   public Results addPost(Post post){
       post.setCreated(LocalDateTime.now().toString());
       int rows = postMapper.addPost(post);
       return new Results(rows > 0);
   }

   public Results searchPosts(Integer uid,String text){
       List<Post> result = postMapper.searchPosts(uid,"%"+text+"%");
       return new Results(result);
   }

   public Results likePost(Integer uid,Integer pid){
       int row = postMapper.likePost(uid,pid,LocalDateTime.now().toString());
       return new Results(row>0);
   }

   public void likeDelete(Integer uid,Integer pid){
       postMapper.likeDelete(uid,pid);
   }

   public Results recommendPosts(Integer uid){
       return new Results(postMapper.recommendPosts(uid));
   }

   public Results getPostsByUser(Integer uid){
       return new Results(postMapper.getPostsByUser(uid));
   }
}
