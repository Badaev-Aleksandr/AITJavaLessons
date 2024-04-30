package homework28;
/*
1. Класс ArtGallery:

Этот класс должен управлять коллекцией произведений искусства. Должен иметь методы для добавления,
удаления и поиска произведений искусства по различным критериям (например, по имени художника).

 Дополнительная функциональность:

2. Реализуйте метод displayAllArtworks() в классе ArtGallery, который выводит информацию обо всех
произведениях искусства в галерее.
Добавьте возможность фильтрации произведений по типу (картины, скульптуры).
 */

import java.util.ArrayList;


public class ArtGallery {
    private ArrayList<Artwork> allArtGallery = new ArrayList<>();

    public ArrayList<Artwork> getAllArtGallery() {
        return allArtGallery;
    }

    // добавление арт объектов
    public void addArtwork(Artwork artwork) {
        allArtGallery.add(artwork);
        System.out.println("Artwork was added");
    }

    // удаление арт объектов
    public void removeArtwork(Artwork artwork) {
        System.out.println("Removal of artwork");
        boolean removeCheck = allArtGallery.remove(artwork);
        if (removeCheck) {
            System.out.println("Artwork was removed");
        } else {
            System.out.println("Artwork not in the list. Was previously deleted");
        }
    }

    // поиск арт объектов по создателю
    public void findArtwork(String creator) {
        boolean checkCreator = false;
        System.out.println("Search artwork by creator:");
        for (Artwork artwork : allArtGallery) {
            if (artwork.getCreator().equalsIgnoreCase(creator)) {
                artwork.displayInfo();
                checkCreator = true;
            }
        }
        if (!checkCreator) {
            System.out.println("Creator " + creator + " Nothing found!");
        }
    }

    // вывод на экран всех арт объектов
    public void displayAllArtworks() {
        System.out.println("All artwork printing:");
        for (Artwork artwork : allArtGallery) {
            artwork.displayInfo();
        }
    }
    // фильтрация произведений по типу
    public void filterArtwork(String artType) {
        boolean checkResult = false;
        System.out.println("All artwork from " + artType);
        for (Artwork artwork : allArtGallery) {
            if (artwork.getArtType().equalsIgnoreCase(artType)){
                artwork.displayInfo();
                checkResult = true;
            }
        }if (!checkResult){
            System.out.println("Artwork not found!");
        }
    }
}