package homework30;

import java.util.HashMap;
import java.util.Objects;

/*
1. Атрибуты: идентификатор, имя пользователя, список загруженных видео.
2. Методы: добавление видео, удаление видео, вывод списка загруженных видео.
 */
public class User {
    private int id;
    private String userName;
    private HashMap<Integer, Video> videoList = new HashMap<>();

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public void addVideo(Video video,User user) {
        boolean check = true;
        for (Integer id : videoList.keySet()) {
            if (id == video.getId()) {
                System.out.println(user.userName + ", Video " + video.getVideoName() + " not added!");
                System.out.println("The " + video.getVideoName() + " is in your list!");
                check = false;
            }
        }
        if (check) {
            videoList.put(video.getId(), video);
            System.out.println(user.userName +", Video " + video.getVideoName() + " was added");
        }
    }

    public void removeVideo(Video video, User user) {
        boolean checkResult = true;
        for (Integer id : videoList.keySet()) {
                if (id == video.getId()) {
                    videoList.remove(video.getId());
                    System.out.println(user.userName + ", Video '" + video.getVideoName() + "' was removed!");
                    checkResult = false;
                    break;
            }
        }
        if (checkResult) {
            System.out.println(user.userName + ", Video not removed, Video '" + video.getVideoName() + "' not found!");
        }
    }

    public void displayListVideo() {
        if (videoList.isEmpty()) {
            System.out.println("No Video!!!");
        } else {
            System.out.println("Video list: " + userName);
            for (Integer id : videoList.keySet()) {
                System.out.println(videoList.get(id));
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "User: " +
                "id: " + id +
                ", user name: '" + userName + '\'' +
                ", video list:" + videoList;
    }

    public int getId() {
        return id;
    }

    public HashMap<Integer, Video> getVideoList() {
        return new HashMap<>(videoList);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
