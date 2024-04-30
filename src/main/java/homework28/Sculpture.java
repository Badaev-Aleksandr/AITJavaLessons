package homework28;

public class Sculpture implements Artwork {

    private String sculptureMaterial;
    private double weight;
    private String creator;
    private String artType;



    public String getSculptureMaterial() {
        return sculptureMaterial;
    }

    public double getWeight() {
        return weight;
    }

    public Sculpture(String artType, String sculptureMaterial, double weight, String creator) {
        this.sculptureMaterial = sculptureMaterial;
        this.weight = weight;
        this.creator = creator;
        this.artType = artType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Art Type: " + artType + " Creator: " + creator + "; Sculpture material: " + sculptureMaterial + "; Weight: " + weight + " kg");
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public String getArtType() {
        return artType;
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "sculptureMaterial='" + sculptureMaterial + '\'' +
                ", weight=" + weight +
                ", creator='" + creator + '\'' +
                ", artType='" + artType + '\'' +
                '}';
    }
}
