>># 这是一个基于SSM框架实现的界面美观，功能完整的论坛。分为[用户系统](http://182.61.136.218:8080/BBS_SSM)和[管理员系统](http://182.61.136.218:8080/BBS_SSM/admin)两部分。
>>1，用户登录用户系统后可以发帖（需要管理员审核通过后才能在首页显示）、修改帖子、删除帖子、评论、删除评论、修改个人信息、关注他人、收藏帖子。
>>
>>2，管理员登录管理员系统后可以管理用户（查看用户、删除用户信息）、管理帖子（查看帖子、审核帖子信息）、管理板块（新增板块、修改板块、删除板块信息）。
>>## 在线演示：
>>>[用户系统（手机上也有不错的展示效果）](http://182.61.136.218:8080/BBS_SSM)
>>
>>>[管理员系统（用户名：admin密码：......）](http://182.61.136.218:8080/BBS_SSM/admin) **↓↓↓**
>>>
>>>>由于总是有人随意删除他人用户信息，故暂不再开放管理员权限，望理解！ 实在是有需要者，QQ（924818949）联系我，私发管理员密码给你。
>>
>>>>作者QQ：924818949
>>## 如何将bbs2.sql导入MySQL数据库：
>>1，创建数据库bbs2：create database bbs2;
>>
>>2，进入bbs2数据库：use bbs2;
>>
>>3，将bbs2.sql导入bbs2数据库：source 你的路径\bbs2.sql;
>>### 技术栈
>>**spring** 、**springmvc** 、**mybatis** 、**mysql** 、**ajax** 、**jquery** 、**bootstrap**
>>### 我的环境
>>**jdk1.8** 、**tomcat9** 、**mysql6.3** 、**maven3.5.4** 、**eclipse4.7.1a**
>>### 静态展示：
>>>### 用户系统
>>>>#### 1，登录
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E7%99%BB%E5%BD%95.png)
>>>>#### 2，首页
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E9%A6%96%E9%A1%B5.png)
>>>>#### 3，发帖
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E5%8F%91%E5%B8%96.png)
>>>>#### 4，个人主页
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E4%B8%AA%E4%BA%BA%E4%B8%BB%E9%A1%B5.png)
>>>>#### 5，编辑个人资料
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E7%BC%96%E8%BE%91%E4%B8%AA%E4%BA%BA%E8%B5%84%E6%96%99.png)
>>>>#### 6，基本信息设置
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E5%9F%BA%E6%9C%AC%E4%BF%A1%E6%81%AF%E8%AE%BE%E7%BD%AE.png)
>>>>#### 7，修改头像（点击头像弹出模态框）
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E4%B8%8A%E4%BC%A0%E5%A4%B4%E5%83%8F.png)
>>>>#### 8，动态.回答.关注.收藏
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%94%A8%E6%88%B7-%E5%8A%A8%E6%80%81.%E5%9B%9E%E7%AD%94.%E5%85%B3%E6%B3%A8.%E6%94%B6%E8%97%8F.png)
>>>### 管理员系统
>>>>#### 1，登录
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%AE%A1%E7%90%86%E5%91%98-%E7%99%BB%E5%BD%95.png)
>>>>#### 2，用户管理
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%AE%A1%E7%90%86%E5%91%98-%E7%94%A8%E6%88%B7%E7%AE%A1%E7%90%86.png)
>>>>#### 3，帖子管理
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%AE%A1%E7%90%86%E5%91%98-%E5%B8%96%E5%AD%90%E7%AE%A1%E7%90%86.png)
>>>>#### 4，版块管理
>>>>![image](https://github.com/maliangnansheng/BBS_SSM/blob/master/picture/%E7%AE%A1%E7%90%86%E5%91%98-%E7%89%88%E5%9D%97%E7%AE%A1%E7%90%86.png)
