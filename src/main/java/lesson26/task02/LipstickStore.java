package lesson26.task02;

import java.util.HashSet;

/*
 Создайте классы `LipstickStore` и `MascaraStore`, которые наследуют от `CosmeticStore`:
  - `LipstickStore` добавляет:
    - Поле: `popularBrands` (список популярных брендов помад)
    - Метод `displayBrands()`, который выводит список популярных брендов.
 */
public class LipstickStore extends CosmeticStore{
    private String popularBrands;
    private HashSet<String> list = new HashSet<>();

    public HashSet<String> getList() {
        return list;
    }

    public LipstickStore(String storeName, String location, String popularBrands) {
        super(storeName, location);
        this.popularBrands = popularBrands;
    }
    void displayBrands(){
       list.add(popularBrands);
       for (String brand: list) {
           System.out.println(brand);
       }
    }

    public String getPopularBrands() {
        return popularBrands;
    }

    @Override
    public String toString() {
        return "LipstickStore{" +
                "popularBrands='" + popularBrands + '\'' +
                '}';
    }
}
