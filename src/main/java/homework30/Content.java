package homework30;
/*
Создайте абстрактный класс Content, который будет содержать общие атрибуты и методы для видео и комментариев.
 */
abstract class Content {
private String author;

    public String getAuthor() {
        return author;
    }

    abstract void info();

}
