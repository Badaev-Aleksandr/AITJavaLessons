package lesson44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryManager.class);

    private List<Country> countries;
    private Path path;

    public CountryManager(Path path) {
        countries = new ArrayList<>(readCountriesFromFile(path));
        path = path.getParent();
    }

    private void updateCountries(Country country, Role role) {
        if (role == Role.ADMIN) {
            if (countries.contains(country)) {
                LOGGER.warn("Страна {} уже есть в списке", country.getName());
                for (Country country1 : countries) {
                    if (country1.getName().equals(country.getName())) {
                        country1 = country;
                    }
                }
            } else {
                LOGGER.info("Страна {} успешно добавлена", country.getName());
                countries.add(country);
            }

            saveCountries(path);
        } else {
            LOGGER.error("Недостаточно прав для выполнения метода");
        }
    }

    private void deleteCountries(Country country, User user, Path path) {
        if (new AuthenticationManager(path).auth(user.getUsername(), user.getPassword()) == Role.ADMIN) {
            boolean deleteResult = countries.remove(country);
            if (deleteResult) {
                LOGGER.info("Удаление страны {} прошло успешно", country.getName());
                saveCountries(path);
            } else {
                LOGGER.warn("Удаление страны  {} не получилось", country.getName());
            }
        } else {
            LOGGER.error("Недостаточно прав для выполнения метода");
        }

    }

    private void saveCountries(Path path) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (Country country : countries) {
                bufferedWriter.write(country.getName() + "," + country.getCapital() + "," + country.getPopulation() + "," + country.getPopulation());

            }
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }
    }


    private List<Country> readCountriesFromFile(Path path) {
        List<Country> countriesList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                String name = split[0].trim();
                String capital = split[1].trim();
                int area = Integer.parseInt(split[2].trim());
                int population = Integer.parseInt(split[3].trim());
                Country country = new Country(name, population, area, capital);
                countriesList.add(country);
            }
            LOGGER.info("В базе данных {} стран", countriesList.size());
        } catch (IOException exception) {
            LOGGER.error("Ошибка чтения файла {}, {}", path.toString(), exception.getMessage());
        }
        return countriesList;
    }

    public List<Country> getCountries() {
        return countries;
    }
}

