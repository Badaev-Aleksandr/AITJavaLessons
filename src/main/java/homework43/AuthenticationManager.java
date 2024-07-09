package homework43;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AuthenticationManager {
    private List<User> users;

    public AuthenticationManager(Path path) {
        users = new ArrayList<>(readUsersAdminsFromFile(path));
    }

    public Role auth(String name, String password) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name) && user.getPassword().equalsIgnoreCase(password)) {
                log.info("Пользователь вошел в систему {}", name);
                return user.getRole();
            }
        }
        log.warn("Пользователь не найден в системе!!! Имя пользователя {}, пароль {}", name, password);
        return Role.NONE;
    }

    private List<User> readUsersAdminsFromFile(Path path) {
        List<User> userList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splittedLine = line.split(",");
                String userName = splittedLine[0];
                String password = splittedLine[1];
                String role = splittedLine[2];
                Role roleEnum = Role.fromStringRole(role);
                User user = new User(userName, password, roleEnum);
                userList.add(user);
            }
            log.info("В базе данных {} пользователей",userList.size());
        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage(), exception);
        } catch (IOException exception) {
            log.error("Ошибка чтения файла {}, {}", path, exception.getMessage());
        } finally {
            return userList;
        }
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }
}
