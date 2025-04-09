package com.zhang.weibo.entity;

//暂时不选择使用DTO
public class Post {

    Integer Id;
    Integer UserId;
    String Tag;
    String Content;
    String Images;
    Integer Likes;
    Integer Comments;
    String Created;
    String UserName;
    String Avatar;

    //先不使用DTO，直接加到实体类里
    Boolean isFollowed;
    Boolean isLiked;

    public Post() {
    }

    public Post(Integer userId, String tag, String content, String images) {
        UserId = userId;
        Tag = tag;
        Content = content;
        Images = images;
        Likes = 0;
        Comments = 0;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getTag() {
        return Tag;
    }

    public void setTag(String tag) {
        Tag = tag;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getImages() {
        return Images;
    }

    public void setImages(String images) {
        Images = images;
    }

    public Integer getLikes() {
        return Likes;
    }

    public void setLikes(Integer likes) {
        Likes = likes;
    }

    public Integer getComments() {
        return Comments;
    }

    public void setComments(Integer comments) {
        Comments = comments;
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

    public Boolean getFollowed() {
        return isFollowed;
    }

    public void setFollowed(Boolean followed) {
        isFollowed = followed;
    }

    public Boolean getLiked() {
        return isLiked;
    }

    public void setLiked(Boolean liked) {
        isLiked = liked;
    }

    @Override
    public String toString() {
        return "Post{" +
                "Id=" + Id +
                ", UserId=" + UserId +
                ", Tag='" + Tag + '\'' +
                ", Content='" + Content + '\'' +
                ", Images='" + Images + '\'' +
                ", Likes=" + Likes +
                ", Comments=" + Comments +
                ", Created='" + Created + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Avatar='" + Avatar + '\'' +
                ", isFollowed=" + isFollowed +
                ", isLiked=" + isLiked +
                '}';
    }
}
