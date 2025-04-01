package com.zhang.weibo.entity;

public class Post {

    Integer Id;
    Integer UserId;
    String Tag;
    String Content;
    String Images;
    Integer Likes;
    Integer Comments;
    Integer Shares;
    String Created;

    public Post() {
    }

    public Post(Integer userId, String tag, String content, String images) {
        UserId = userId;
        Tag = tag;
        Content = content;
        Images = images;
        Likes = 0;
        Comments = 0;
        Shares = 0;
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

    public Integer getShares() {
        return Shares;
    }

    public void setShares(Integer shares) {
        Shares = shares;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
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
                ", Shares=" + Shares +
                ", Created='" + Created + '\'' +
                '}';
    }
}
