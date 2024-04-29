package homework28;

public class Sculpture implements Artwork {

    private String sculptureMaterial;
    private double weight;
    private String creator;

    public String getSculptureMaterial() {
        return sculptureMaterial;
    }

    public double getWeight() {
        return weight;
    }

    public Sculpture(String sculptureMaterial, double weight, String creator) {
        this.sculptureMaterial = sculptureMaterial;
        this.weight = weight;
        this.creator = creator;
    }

    @Override
    public void displayInfo() {
        System.out.println("Creator: " + creator + "; Sculpture material: " + sculptureMaterial + "; Weight: " + weight + " kg");
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "sculptureMaterial='" + sculptureMaterial + '\'' +
                ", weight=" + weight +
                ", creator='" + creator + '\'' +
                '}';
    }
}
