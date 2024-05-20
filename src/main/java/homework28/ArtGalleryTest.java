package homework28;

public class ArtGalleryTest {
    public static void main(String[] args) {
        ArtGallery artworks = new ArtGallery();
        Painting paintingOne = new Painting( "Painting" ,"Watercolor", "45x90 cm", "Badaev");
        Artwork paintingTwo = new Painting( "Painting","Oil", "155x200 cm", "Musterman");
        Artwork paintingThree = new Painting("Painting","Spray", "200x300 cm", "Zigel");
        Artwork sculptureOne = new Sculpture("Sculpture","Stone", 230.4, "Musterman");
        Artwork sculptureTwo = new Sculpture("Sculpture","Gold", 111.7, "Badaev");
        Artwork sculptureThree = new Sculpture("Sculpture","Silver", 567.6, "Badaev");

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
        System.out.println("------------------");
        artworks.findArtwork("Musterman");
        System.out.println("------------------");
        artworks.filterArtwork("Sculpture");
        System.out.println("------------------");
        artworks.filterArtwork("Painting");
    }
}
