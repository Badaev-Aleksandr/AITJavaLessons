package lesson44;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AuthenticationManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationManager.class);


    private List<User> users;

    public AuthenticationManager(Path path) {
        users = new ArrayList<>(readUsersAdminsFromFile(path));
    }

    public Role auth(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                LOGGER.info("Пользователь вошел в систему");
                return user.getRole();
            }
        }
        LOGGER.warn("Пользователь в системе не был найден. Имя пользователя {}, пароль {}",
                username, password);
        return Role.NONE;
    }

    private List<User> readUsersAdminsFromFile (Path path){
        List<User> userList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splittedLine = line.split(",");
                String username = splittedLine[0];
                String password = splittedLine[1];
                String role = splittedLine[2];
                Role roleEnum = Role.fromStringRole(role);
                User user = new User(username, password, roleEnum);
                userList.add(user);

            }
            LOGGER.info("В базе данных {} пользователей", userList.size());
        }
        catch(IOException e){
            LOGGER.error("Ошибка чтения файла {}, {}", path.toString(), e.getMessage());
        }
        return userList;

    }

    public List<User> getUsers() {
        return users;
    }
}


