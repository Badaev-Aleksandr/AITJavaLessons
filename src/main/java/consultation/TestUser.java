package consultation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(32);
        user.setName("Alex");
        user.setEMail("vv.www");
        log.info(user.toString());
        System.out.println(user);
    }
}
