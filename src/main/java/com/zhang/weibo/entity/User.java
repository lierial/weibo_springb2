package com.zhang.weibo.entity;

public class User {
    private Integer Id;
    private String Name;
    private String Bio;
    private String Avatar;
    private String Created;
    private String Account;
    private String Password;

    private Integer follows = 0;
    private Integer posts = 0;
    private Integer fans = 0;

    public User(){}

    public User(String name, String account, String password) {
        Name = name;
        Account = account;
        Password = password;
        Bio = "用户很懒，什么都没有留下";
        Avatar = "https://img.ixintu.com/download/jpg/20200910/f9256155491e54bf5e99bf29eece0156_512_512.jpg";
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Bio='" + Bio + '\'' +
                ", Avatar='" + Avatar + '\'' +
                ", Created='" + Created + '\'' +
                ", Account='" + Account + '\'' +
                ", Password='" + Password + '\'' +
                ", follows=" + follows +
                ", posts=" + posts +
                ", fans=" + fans +
                '}';
    }
}
