package homework30;

/*
1. Атрибуты: текст комментария, автор комментария.
2. Методы: вывод информации о комментарии.
 */
public class Comment extends Content {
    private String textComment;
    private User authorComment;
    private Video video;

    public Comment(String textComment, User authorComment, Video video) {
        this.textComment = textComment;
        this.authorComment = authorComment;
        this.video = video;
    }

    @Override
    public String toString() {
        return "Comment: " + "text comment: '" + textComment + '\'' + ", author comment: '" + authorComment.getUserName() +
                "', Video name: " + video.getVideoName();
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public User getAuthorComment() {
        return authorComment;
    }

    public Video getVideo() {
        return video;
    }

    @Override
    void info() {
        System.out.println("Comment: " + "text comment: '" + textComment + '\'' + ", author comment: '" + authorComment.getUserName() +
                "', Video name: " + video.getVideoName());
    }


}
