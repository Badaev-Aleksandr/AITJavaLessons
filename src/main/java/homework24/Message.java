package homework24;
/*
2. Сообщения (Использование ArrayList):

1. Создайте класс Message, который содержит информацию о сообщении: отправитель (User),
текст сообщения (String), и время отправки (LocalDateTime).
2. В классе User, добавьте поле, которое будет хранить список сообщений (ArrayList<Message>), отправленных пользователем.
3. В классе Message, реализуйте систему лайков. Используйте HashSet<User> для хранения пользователей,
которым понравилось сообщение.
 */

import java.time.LocalDateTime;
import java.util.HashSet;

public class Message {
    private User sender;
    private String text;
    private LocalDateTime time;
    private HashSet<User> messageLike = new HashSet<>();

    public Message(User sender, String text, LocalDateTime time) {
        this.sender = sender;
        this.text = text;
        this.time = time;
    }

    public HashSet<User> getMessageLike() {
        return messageLike;
    }

    public void setMessageLike(HashSet<User> messageLike) {
        this.messageLike = messageLike;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", text='" + text + '\'' +
                ", time=" + time +
                '}';
    }

    public void likeMessage(User user) {
        messageLike.add(user);
        System.out.println(user.getName() + " You've been like a message \uD83D\uDC4D");
    }
}

