package com.zhang.weibo.entity;

public class Comment {

    Integer id;

    Integer UserId;

    Integer PostId;

    Integer ParentId;

    String Content;

    Integer Likes;

    String Created;

    String UserName;
    String Avatar;

    public Comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getPostId() {
        return PostId;
    }

    public void setPostId(Integer postId) {
        PostId = postId;
    }

    public Integer getParentId() {
        return ParentId;
    }

    public void setParentId(Integer parentId) {
        ParentId = parentId;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Integer getLikes() {
        return Likes;
    }

    public void setLikes(Integer likes) {
        Likes = likes;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", UserId=" + UserId +
                ", PostId=" + PostId +
                ", ParentId=" + ParentId +
                ", Content='" + Content + '\'' +
                ", Likes=" + Likes +
                ", Created='" + Created + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Avatar='" + Avatar + '\'' +
                '}';
    }
}
