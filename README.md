### Weibo_springb2

Weibo_springb2是[Weibo_Flutter](https://github.com/lierial/weibo_flutter)的后端项目

该项目使用Java+SpringBoot2+Mybatis+Mysql实现。

该项目简单实现了对数据库的**增删改查**以及**多表联查**

### 数据生成

后端的数据借由**Python**的**Faker**库实现

其代码在[Python文件夹](https://github.com/lierial/weibo_springb2/tree/main/python)下

### 后端表结构

Users表

| 名称     | 类型     | 注释           |
| -------- | -------- | -------------- |
| id       | int      | 用户的ID索引   |
| name     | varchar  | 用户名         |
| bio      | varchar  | 用户简介       |
| avatar   | varchar  | 用户的头像链接 |
| created  | datetime | 注册时间       |
| account  | varchar  | 用户账号       |
| password | varchar  | 用户密码       |

Posts表

| 名称    | 类型     | 注释             |
| ------- | -------- | ---------------- |
| id      | int      | 帖子的id索引     |
| user_id | int      | 发帖用户的ID索引 |
| tag     | varchar  | 发帖所附带的话题 |
| content | text     | 帖子内容         |
| images  | text     | 帖子所附带的图片 |
| created | datetime | 帖子发布时间     |

Comments表

| 名称      | 类型     | 注释                                     |
| --------- | -------- | ---------------------------------------- |
| id        | int      | 评论的ID索引                             |
| user_id   | int      | 发评论用户的ID索引                       |
| post_id   | int      | 评论所在帖子的ID索引                     |
| content   | text     | 评论内容                                 |
| likes     | int      | 评论点赞数                               |
| created   | datetime | 评论发布时间                             |
| parent_id | int      | 评论所回复的评论的ID，若无则直接为帖子ID |

Follows表

| 名称        | 类型     | 注释                 |
| ----------- | -------- | -------------------- |
| id          | int      | 关注的ID索引         |
| follower_id | int      | 关注者的用户ID索引   |
| followee_id | int      | 被关注者的用户ID索引 |
| created     | datetime | 关注时间             |

Likes表

| 名称    | 类型     | 注释                 |
| ------- | -------- | -------------------- |
| id      | int      | 点赞的ID索引         |
| user_id | int      | 点赞用户的ID索引     |
| post_id | int      | 被点赞的帖子的ID索引 |
| created | datetime | 点赞时间             |

