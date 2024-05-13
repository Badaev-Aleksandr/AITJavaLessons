package homework30;

import java.util.HashSet;
import java.util.Objects;

/*
1. Атрибуты: идентификатор, название, длительность, количество просмотров, количество лайков, количество дизлайков.
2. Методы: вывод информации о видео, обновление статистики (просмотры, лайки, дизлайки).
 */
public class Video extends Content implements Interactable {
    private int id;
    private String videoName;
    private int duration;
    private int quantityViews;
    private int quantityLikes;
    private int quantityDislikes;

    public Video(int id, String videoName, int duration) {
        this.id = id;
        this.videoName = videoName;
        this.duration = duration;
    }

    @Override
    public void like(User user, Video video) {
        quantityLikes++;
        System.out.println(user.getUserName() + ", 👍 Video "+ video.getVideoName());
    }


    @Override
    public void disLike(User user, Video video) {
        quantityDislikes++;
        System.out.println(user.getUserName() + ", 👎 Video " + video.getVideoName());
    }

    @Override
    public void views(User user, Video video) {
        quantityViews++;
        System.out.println(user.getUserName() + ", 👀 Video " + video.getVideoName());
    }

    @Override
    void info() {
        System.out.println("Video: " +
                " id: " + id +
                ", video name: '" + videoName + '\'' +
                ", duration minutes: <" + duration + "> m" +
                ", quantity views: <" + quantityViews + ">👀" +
                ", quantity likes: <" + quantityLikes + ">👍" +
                ", quantity dislikes: <" + quantityDislikes + ">👎");
    }


    @Override
    public String toString() {
        return "Video: " +
                " id: " + id +
                ", video name: '" + videoName + '\'' +
                ", duration minutes: < " + duration + " m>" +
                ", quantity views: < " + quantityViews + " 👀>" +
                ", quantity likes: < " + quantityLikes + " 👍>" +
                ", quantity dislikes: < " + quantityDislikes + " 👎>";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return id == video.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public int getId() {
        return id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getQuantityViews() {
        return quantityViews;
    }

    public void setQuantityViews(int quantityViews) {
        this.quantityViews = quantityViews;
    }

    public int getQuantityLikes() {
        return quantityLikes;
    }

    public void setQuantityLikes(int quantityLikes) {
        this.quantityLikes = quantityLikes;
    }

    public int getQuantityDislikes() {
        return quantityDislikes;
    }

    public void setQuantityDislikes(int quantityDislikes) {
        this.quantityDislikes = quantityDislikes;
    }

}
