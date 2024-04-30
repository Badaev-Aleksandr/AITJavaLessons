package homework28;

public class ArtGalleryTest {
    public static void main(String[] args) {
        ArtGallery artworks = new ArtGallery();
        Artwork paintingOne = new Painting("Watercolor", "45x90 cm", "Badaev");
        Artwork paintingTwo = new Painting("Oil", "155x200 cm", "Musterman");
        Artwork paintingThree = new Painting("Spray", "200x300 cm", "Zigel");
        Artwork sculptureOne = new Sculpture("Stone", 230.4, "Musterman");
        Artwork sculptureTwo = new Sculpture("Gold", 111.7, "Badaev");
        Artwork sculptureThree = new Sculpture("Silver", 567.6, "Badaev");
        artworks.addArtwork(sculptureThree);
        artworks.addArtwork(paintingOne);
        artworks.addArtwork(paintingTwo);
        artworks.addArtwork(paintingThree);
        artworks.addArtwork(sculptureOne);
        artworks.addArtwork(sculptureTwo);
        System.out.println("------------------");
        artworks.displayAllArtworks();
        System.out.println("------------------");
        paintingThree.displayInfo();
        sculptureOne.displayInfo();
        System.out.println("------------------");
        artworks.removeArtwork(paintingThree);
        artworks.removeArtwork(paintingThree);
        System.out.println("------------------");
        artworks.findArtwork("badaev");
        artworks.findArtwork("Musterman");

        artworks.sortArtwork();
    }
}
