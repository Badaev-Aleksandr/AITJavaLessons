package homework11;

import java.util.Scanner;

public class CarDate {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите марку автомобиля: ");
        String carBrand = scanner.next().trim();
        System.out.println("Введите четырехзначный год выпуска Авто : ");
        String countryOfOrigin;
        String carInfo;
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка, введите число");
            scanner.next();
        }
        int year = scanner.nextInt();
        switch (carBrand.toLowerCase()) {
            case "ford":
                countryOfOrigin = "США с 1908 года";
                if (year >= 1908 && year <= 1927) {
                    carInfo = "Эпоха Ford Модель Т.  Tin Lizzie c 1908 по 1927 16,5 миллионов продаж.";
                } else if (year >= 1948 && year <= 1963) {
                    carInfo = "Эпоха Ford Грузовики серии F. Были запущены с F1, полутонного грузовика,\n" +
                            " и F8, трехтонного грузовика. С тех пор было продано более 40 миллионов грузовиков серии F.";
                } else if (year >= 1964 && year <= 1984) {
                    carInfo = "Эпоха Ford Мустанг.Ford выпустил Mustang в 1964 году.\n" +
                            " К 1968 году было продано более 2 миллионов автомобилей, а к 1973 году – 3 миллиона. ";
                } else if (year >= 1985 && year <= 2024) {
                    carInfo = "Эпоха Ford Explorer Внедорожники. Этот внедорожник был выпущен в 1990 году.\n" +
                            " Было продано более 7 миллионов экземпляров. Продажи увеличились после 2011 года,\n " +
                            "когда Ford перешел на производство грузовиков.";
                } else {
                    carInfo = year + " Год " + " Еще нет в производстве";
                }
                break;
            case "volvo":
                countryOfOrigin = "Швеция, Свою деятельность начала в 1924 года";
                if (year >= 1956 && year <= 1970) {
                    carInfo = "Выход модели седан поколения Volvo 120 Series ";
                } else if (year >= 1974 && year <= 1993) {
                    carInfo = "Выход модели поколения Volvo 240 Series";
                } else if (year >= 2000 && year <= 2009) {
                    carInfo = "Выход модели поколения Volvo S60, спортивный седан первого поколения";
                } else if (year >= 2010 && year <= 2024) {
                    carInfo = "Выход модели Вольво XC60 - один из самых стильных кроссоверов.\n" +
                     "Безопасность - вот один из главных приоритетов, который использовался при разработке Volvo XC60.";
                }else {
                    carInfo = year + " Год " + " Еще нет в производстве";
                }
                break;
            default:
                countryOfOrigin = "Информация отсутствует ";
                carInfo = "Информация не найдена ";
                break;
        }
        printCarData(countryOfOrigin, carInfo);

    }

    public static void printCarData(String country, String info) {
        System.out.println("Страна производитель: " + country);
        System.out.println("Дополнительная информация: " + info);
    }

}

