package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int CreatedBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private String copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSource postSource;

    private Geo geo;
    private int signerId;

    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private boolean postponedId;

    // + get/set на все поля
}
