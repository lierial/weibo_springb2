package com.zhang.weibo.mapper;

import com.zhang.weibo.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> getAllComment(@Param("pid") Integer pid);

    int addComment(@Param("uid") Integer uid,@Param("pid") Integer pid,@Param("content") String content,@Param("time") String time);

}
