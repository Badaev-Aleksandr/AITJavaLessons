package homework24;

import java.util.ArrayList;
import java.util.HashMap;

public class UserCommunity {
    private HashMap<Integer, User> allUser = new HashMap<>();
    private HashMap<String,Community> allCommunity = new HashMap<>();

    public void addUser(User user){
        if (user == null) {
            System.out.println("ERROR!!! Element is empty");
        } else {
            if (allUser.containsValue(user)) {
                System.out.println("User " + user.getName() + " already in the user list");
            } else {
                allUser.put(user.getId(), user);
                System.out.println("User " + user.getName() + " added to user list");
            }
        }
    }
    public void addCommunity(Community community){
        allCommunity.put(community.getName(), community);
    }

    public HashMap<Integer, User> getAllUser() {
        return allUser;
    }

    public HashMap<String, Community> getAllCommunity() {
        return allCommunity;
    }
    public  User findUser(User userToFind){
        User foundUser = allUser.get(userToFind.getId());
        if (foundUser == null){
            System.out.println("user is not in the list");
        }else {
            System.out.println("the user is in the list");
        }
        return foundUser;
    }
}
