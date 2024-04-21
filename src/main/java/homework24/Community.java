package homework24;

import java.util.HashMap;
import java.util.HashSet;

/*
Лайки и Сообщества (Использование HashMap):

1. В классе Message, реализуйте систему лайков. Используйте HashSet<User> для хранения пользователей,
которым понравилось сообщение.
2. Создайте класс Community, представляющий сообщество или группу в социальной сети. Он должен содержать
название сообщества (String) и список его участников (HashSet<User>).
3. Используйте HashMap<String, Community> для хранения всех сообществ в социальной сети,
где ключ — это название сообщества.
 */
public class Community {
    private String name;

    private HashSet<User> members = new HashSet<>();

    public static HashMap<String, Community> communityHashMap = new HashMap<>();

    public Community(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<User> getMembers() {
        return members;
    }

    public void setMembers(HashSet<User> members) {
        this.members = members;
    }

    public void addMember(User user) {
        members.add(user);
    }

    public void printListCommunity() {
        if (members.isEmpty()) {
            System.out.println("--------Community list--------");
            System.out.println("Community list is empty :(");
            System.out.println("----------------------------");
        } else {
            System.out.println("--------Community list--------");
            for (User users : members) {
                System.out.println(users.getName() + " @" + users.getId());
            }
            System.out.println("----------------------------");
        }
    }
    public void removeFromCommunityList(User user){
        boolean removedCheck = members.remove(user);
        if (removedCheck){
            System.out.println("User "+ user.getName() + ", was removed from Community");
        } else {
            System.out.println("Unable to delete from " + communityHashMap.get(getName()));
            System.out.println("User " + user.getName() + ", not found in Community!");
        }
    }
    public void foundUser(User user){
    boolean foundCheck = members.contains(user);
    if (foundCheck){
        System.out.println("User " + user.getName() + " consists in " + communityHashMap.get(getName()));
    }
    }

    @Override
    public String toString() {
        return "Community{" +
                "community='" + name + '\'' +
                ", participants=" + members +
                ", allCommunity=" + communityHashMap +
                '}';
    }
}
