package homework43;

import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of("src", "main", "resources", "users.txt");
        Path pathCountries = Path.of("src", "main", "resources", "countries.txt");
        AuthenticationManager authenticationManager = new AuthenticationManager(path);

        System.out.println("Введите логин");
        String userName = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        Role authResult = authenticationManager.auth(userName.trim(), password.trim());
        if (authResult == Role.USER) {
            System.out.println("Вы имеете право видеть данные по странам");
            CountryManager countryManager = new CountryManager(pathCountries);

            List<Country> countries = countryManager.getCountries();
            for (Country country : countries) {
                System.out.println(country);
            }
        } else if (authResult == Role.ADMIN)
            System.out.println("Вы имеете права администратора");
        else
            System.out.println("Вы не зарегистрированы ");
    }
}
