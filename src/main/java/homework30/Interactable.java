package homework30;
/*
Определите интерфейс Interactable с методами для взаимодействия (например, лайк, дизлайк, просмотр).
 */
public interface Interactable {
    void like(User user, Video video);
    void disLike(User user, Video video);
    void views(User user, Video video);
}
