package lesson26.task02;

import java.util.HashSet;

/*
- `MascaraStore` добавляет:
    - Поле: `bestSellers` (список бестселлеров туши)
    - Метод `displayBestSellers()`, который выводит список бестселлеров.
 */
public class MascaraStore extends CosmeticStore{
private HashSet<String> bestSellers = new HashSet<>();
private String bestSellersName;

    public MascaraStore(String storeName, String location, String bestSellersName) {
        super(storeName, location);
        this.bestSellersName = bestSellersName;
    }

    void displayBestSellers(){
        bestSellers.add(bestSellersName);
        for (String bestSeller : bestSellers){
            System.out.println(bestSeller);
        }
    }

    public HashSet<String> getBestSellers() {
        return bestSellers;
    }

    public String getBestSellersName() {
        return bestSellersName;
    }

    @Override
    public String toString() {
        return "MascaraStore{" +
                "bestSellers=" + bestSellers +
                ", bestSellersName='" + bestSellersName + '\'' +
                '}';
    }
}
