package homework15;

import java.util.Scanner;

/*
Задача:
Вам нужно создать программу для учета животных в зоопарке, используя только массивы и базовые методы.
Программа должна позволять хранить названия видов животных и соответствующие им звуки, которые они издают.

Шаги:

Создание массивов:

1. Создайте два массива строк: один для хранения названий видов животных (String[] animalSpecies),
другой — для звуков, которые они издают (String[] animalSounds).

Инициализация массивов:
2. Инициализируйте массивы с данными нескольких животных. Например, "Лев", "Слон",
и "Обезьяна" для animalSpecies и соответствующие звуки для animalSounds.

Вывод информации о животных:
3. Реализуйте метод printAnimalSounds, который принимает оба массива и
выводит информацию о каждом животном и звуке который оно издает.

Поиск животного по названию:
4. Дополнительно, реализуйте метод findAnimalSound, который принимает название животного
и оба массива, ищет это животное в массиве animalSpecies и выводит соответствующий звук из animalSounds.
 */
public class Zoo {
    private static String[] animalSpecies = {"Lion.", "Elephant.", "Monkey."};
    private static String[] animalSounds = {"growl", "trumpeting", "scream"};


    public static void main(String[] args) {
        printAnimalSounds(animalSpecies, animalSounds);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the animal to find its sound: ");
        String findSoundOfAnimal = scanner.next();
        String soundOfAnimal = findAnimalSound(findSoundOfAnimal, animalSpecies, animalSounds);
        System.out.println(soundOfAnimal);
    }

    public static void printAnimalSounds(String[] animalSpecies, String[] animalSounds) {
        for (int i = 0; i < animalSpecies.length; i++) {
            String animal = animalSpecies[i];
            String sound = animalSounds[i];
            System.out.println("Animal: " + animal + " Makes a sound: " + sound);
        }
    }

    public static String findAnimalSound(String findSoundOfAnimal, String[] animalSpecies, String[] animalSounds) {
        for (int i = 0; i < animalSpecies.length; i++) {
            String animal = animalSpecies[i];
            String sound = animalSounds[i];
            if (findSoundOfAnimal.equalsIgnoreCase(animal)) {
                return sound;
            }
        }
        return findSoundOfAnimal; // <------Не понимаю почему просит вывести тут return findSoundOfAnimal
    }
}





