package homework23;

import java.util.Objects;

/*
Задача: Разработка системы управления одеждой
Цель: Разработать систему управления одеждой для магазина одежды, используя коллекцию HashSet.
Система должна позволять добавлять, удалять и искать одежду по определенным характеристикам.
Особое внимание следует уделить реализации методов equals() и hashCode() для корректной работы с
объектами одежды в HashSet.

Шаг 1: Определение класса.
Создайте класс ClothingItem с характеристиками: name (название), size (размер), color (цвет) и
category (категория, например, верхняя одежда, нижняя одежда, обувь). Все поля должны быть приватными с
геттерами и сеттерами.
Шаг 2: Реализация equals() и hashCode()
Переопределите методы equals() и hashCode() в классе ClothingItem. equals() должен сравнивать одежду
по всем характеристикам, кроме name, предполагая, что одежда одинакова, если она имеет тот же размер,
цвет и категорию. hashCode() должен генерировать хеш-код, основываясь на тех же критериях.
Шаг 3: Работа с HashSet.
Разработайте класс ClothingManager, который использует HashSet для управления коллекцией ClothingItem.
Класс должен иметь методы для добавления, удаления и поиска одежды. Убедитесь, что добавление одинаковых
элементов (согласно определению в equals()) не допускается.
Шаг 4: Тестирование
Напишите тестовый класс, который создает экземпляр ClothingManager и добавляет в него несколько элементов
ClothingItem. Попробуйте добавить элементы с одинаковыми и разными характеристиками, чтобы проверить,
как работает сравнение.

Протестируйте поиск и удаление одежды из HashSet, используя различные характеристики. Проверьте, корректно ли работает
поиск по характеристикам и удаляется ли одежда правильно.

Дополнительные задания:
Реализуйте функционал, который позволит выводить содержимое HashSet в отсортированном порядке по одному
из атрибутов (например, по размеру или категории).
Добавьте в ClothingManager метод для вывода всех уникальных категорий одежды, присутствующих в коллекции.
 */
public class ClothingItem {
    private String name; // название одежды
    private double size; // размер одежды
    private String color; // цвет одежды
    private String category; // категория, например, верхняя одежда, нижняя одежда, обувь

    public ClothingItem(String name, double size, String color, String category) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClothingItem that = (ClothingItem) o;
        return Double.compare(size, that.size) == 0 && Objects.equals(color, that.color) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, category);
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}