package com.zhang.weibo.mapper;

import com.zhang.weibo.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    void insertPost(Post post);

    Post getPostById(int id);

    List<Post> getPostsByUserId(int uid);

    List<Post> getTopPosts();
}
