package ru.netology.domain;

public class Post {
    private int id;
    private PublisherPost publisherPost;
    private int time;
    private OwnerPost ownerPost;
    private TextPost textPost;
    private PicturesPost picturesPost;
    private LinkPost linkPost;

    private LikeInfo likeInfo;
    private CommentsInfo commentsInfo;
    private RepostInfo repostInfo;
    private ViewInfo viewInfo;

    // + get/set на все поля
}
