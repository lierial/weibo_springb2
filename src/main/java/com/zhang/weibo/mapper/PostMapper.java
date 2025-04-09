package com.zhang.weibo.mapper;

import com.zhang.weibo.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> getFollowsPosts(@Param("uid") int uid,@Param("page") Integer page);

    int addPost(Post post);

    List<Post> searchPosts(@Param("uid") Integer uid,@Param("text") String text);

    int likePost(@Param("uid") Integer uid,@Param("pid") Integer pid,@Param("time") String time);

    int likeDelete(@Param("uid") Integer uid,@Param("pid") Integer pid);

    List<Post> recommendPosts(@Param("uid") Integer uid);

    List<Post> getPostsByUser(@Param("uid") Integer uid);
}
