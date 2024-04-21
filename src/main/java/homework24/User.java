package homework24;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/*
       1. Пользователи и Друзья (Использование ArrayList и HashSet):

1. Создайте класс User, который должен содержать информацию о пользователе: имя (String),
уникальный идентификатор (int), и список друзей (используйте HashSet для хранения объектов User,
представляющих друзей пользователя).
2. Реализуйте методы для добавления и удаления друзей пользователя.

       2. Сообщения (Использование ArrayList):

1. Создайте класс Message, который содержит информацию о сообщении: отправитель (User), текст сообщения (String),
и время отправки (LocalDateTime).
2. В классе User, добавьте поле, которое будет хранить список сообщений (ArrayList<Message>), отправленных пользователем.

       3. Лайки и Сообщества (Использование HashMap):

1. В классе Message, реализуйте систему лайков. Используйте HashSet<User> для хранения пользователей,
которым понравилось сообщение.
2. Создайте класс Community, представляющий сообщество или группу в социальной сети. Он должен содержать название
сообщества (String) и список его участников (HashSet<User>).
3. Используйте HashMap<String, Community> для хранения всех сообществ в социальной сети, где ключ — это название сообщества.

       4. Поиск (Использование HashMap):

1. Реализуйте функциональность поиска пользователей по имени. Используйте HashMap<Integer, User> для хранения
всех пользователей с их уникальными идентификаторами в качестве ключей.
2. Добавьте функцию поиска сообществ по названию.

        Дополнительные требования:

1. Все классы должны иметь геттеры и сеттеры для своих полей.
2. Реализуйте методы toString() для удобства отладки и вывода информации о пользователях, сообщениях и сообществах.
3. Создайте тестовый класс с main методом, где вы демонстрируете работу вашей модели: создание пользователей,
добавление их в друзья, отправка сообщений, использование лайков, создание и управление сообществами.
 */
public class User {
    private String name;
    private int id;
    private HashSet<User> friends = new HashSet<>();
    private ArrayList<Message> listOfMessages = new ArrayList<>();


    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<User> getFriends() {
        return friends;
    }

    public void setFriends(HashSet<User> friends) {
        this.friends = friends;
    }

    public ArrayList<Message> getListOfMessages(Message message) {
        return listOfMessages;
    }

    public void setListOfMessages(ArrayList<Message> listOfMessages) {
        this.listOfMessages = listOfMessages;
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
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Name " + name + " ID " + id;
    }

    public void addFriends(User whoUser, User friend) {
        boolean addResult = friends.add(friend);
        if (addResult) {
            System.out.println(whoUser.getName() + " added a friend '" + friend.getName() + "' ");
        } else {
            System.out.println(whoUser.getName() + ", User " + " '" + friend.getName() + "' was not added as a friend. \n" +
                    "He is already your friend");
        }
    }

    public void removeFriend(User whoUser, User friend) {
        boolean removedResult = friends.remove(friend);
        if (removedResult) {
            System.out.println(whoUser.getName() + ", User " + " '" + friend.getName() + "' was removed from friends");
        } else {
            System.out.println("Unable to delete from friends!!!");
            System.out.println(whoUser.getName() + ", User " + " '" + friend.getName() + "' not found in friends, ");
        }
    }

    public void sendMessage(String messageText, LocalDateTime sendTime) {
        listOfMessages.add(new Message(this, messageText, sendTime));
    }

    public void printListFriends(User user) {
        if (friends.isEmpty()) {
            System.out.println("--------Friends list " + user.getName() + "--------");
            System.out.println("You don't have any friends yet :(");
            System.out.println("----------------------------");
        } else {
            System.out.println("--------Friends list " + user.getName() + "--------");
            for (User friend : friends) {
                System.out.println(friend.getName() + " @" + friend.getId());
            }
            System.out.println("----------------------------");
        }
    }
}
