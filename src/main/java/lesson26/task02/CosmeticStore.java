package lesson26.task02;
/*
Создайте класс `CosmeticStore` и наследуемые от него классы, которые будут специализироваться
на продаже определенных видов косметики.
- Класс `CosmeticStore` должен содержать:
  - Поля: `storeName`, `location`
  - Метод `describe()`, который выводит описание магазина.
- Создайте классы `LipstickStore` и `MascaraStore`, которые наследуют от `CosmeticStore`:
  - `LipstickStore` добавляет:
    - Поле: `popularBrands` (список популярных брендов помад)
    - Метод `displayBrands()`, который выводит список популярных брендов.
  - `MascaraStore` добавляет:
    - Поле: `bestSellers` (список бестселлеров туши)
    - Метод `displayBestSellers()`, который выводит список бестселлеров.
#### Требования
Разработайте указанные классы и методы, а затем продемонстрируйте их работу,
создав экземпляры каждого типа магазина и вызывая их специфические методы в `main`.
 */

public class CosmeticStore {
    private String storeName;
    private String location;

    public CosmeticStore(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
    }
    void describe(){
        System.out.println("Магазин " + getStoreName() + " по продаже косметики находится " + getLocation());
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CosmeticStore{" +
                "storeName='" + storeName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
