package homework24;

import java.util.ArrayList;
import java.util.HashMap;

public class UserCommunity {
    private HashMap<Integer, User> allUser = new HashMap<>();
    private HashMap<String, Community> allCommunity = new HashMap<>();

    public void addUser(User user) {
        if (user == null) {
            System.out.println("ERROR!!! you are trying to add an empty element");
        } else {
            if (allUser.containsValue(user)) {
                System.out.println("User " + user.getName() + " already in the user list");
            } else {
                allUser.put(user.getId(), user);
                System.out.println("User " + user.getName() + " added to user list");
            }
        }
    }

    public void addCommunity(Community community) {
        allCommunity.put(community.getName(), community);
    }

        // Поиск зарегистрированного пользователя
    public User findUser(User userToFind) {
        System.out.println("Search for registered user");
        User foundUser = allUser.get(userToFind.getId());
        if (foundUser == null) {
            System.out.println("user " + userToFind.getName() + " is not in the list");
        } else {
            System.out.println("user " + userToFind.getName() + " is in the list");
        }
        return foundUser;
    }
    public HashMap<Integer, User> getAllUser() {
        return allUser;
    }

    public HashMap<String, Community> getAllCommunity() {
        return allCommunity;
    }
}
