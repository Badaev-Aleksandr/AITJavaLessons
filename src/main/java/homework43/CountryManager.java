package homework43;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


@Slf4j
public class CountryManager {

    private List<Country> countries;
    private Path path;

    public CountryManager(Path path) {
        countries = new ArrayList<>(readCountriesFromFile(path));
        path = path.getParent();
    }

    private void updateCountries(Country country, Role role) {
        if (role == Role.ADMIN) {
            if (countries.contains(country)) {
                log.warn("Страна {} уже есть в списке", country.getCountry());
                for (Country country1 : countries) {
                    if (country1.getCountry().equalsIgnoreCase(country.getCountry())) {
                        country1 = country;
                    }
                }
            } else {
                log.info("Страна {} успешно добавлена", country.getCountry());
                countries.add(country);
            }
            saveCountries(path);
        }else {
            System.out.println("У вас не достаточно прав!");
            log.error("У вас не достаточно прав!");
        }
    }

    private void deleteCountry(Country country, User user, Path path) {
        if (new AuthenticationManager(path).auth(user.getName(), user.getPassword()) == Role.ADMIN) {
            boolean deleteResult = countries.remove(country);
            if (deleteResult) {
                log.info("Удаление страны {} прошло успешно ", country.getCountry());
                saveCountries(path);
            } else {
                log.warn("Удаление страны {} не прошло", country.getCountry());
            }
        }else {
            System.out.println("У вас не достаточно прав!");
            log.error("У вас не достаточно прав!");
        }
    }

    private void saveCountries(Path path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (Country country : countries) {
                bw.write(country.getCountry() + "," + country.getCapital() + "," + country.getPopulation() + "," + country.getArea());
            }
        } catch (IOException exception) {
            log.error(exception.getMessage());
        }
    }


    private List<Country> readCountriesFromFile(Path path) {
        List<Country> countryList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                String countryName = split[0].trim();
                String capital = split[1].trim();
                int population = Integer.parseInt(split[2]);
                int area = Integer.parseInt(split[3]);
                Country country = new Country(countryName, capital, population, area);
                countryList.add(country);
            }
            log.info("В базе данных {} стран", countryList.size());
        } catch (FileNotFoundException exception) {
            log.error(exception.getMessage());
        } catch (IOException exception) {
            log.error("Ошибка чтения файла {}, {}", path, exception.getMessage());
        } finally {
            return countryList;
        }
    }

    public List<Country> getCountries() {
        return countries;
    }
}
