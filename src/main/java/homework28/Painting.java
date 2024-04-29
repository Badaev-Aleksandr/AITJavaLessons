package homework28;

public class Painting implements Artwork {
    private String typeOfPaint;
    private String paintingSize;
    private String creator;

    public String getTypeOfPaint() {
        return typeOfPaint;
    }

    public String getPaintingSize() {
        return paintingSize;
    }

    public Painting(String typeOfPaint, String paintingSize, String creator) {
        this.typeOfPaint = typeOfPaint;
        this.paintingSize = paintingSize;
        this.creator = creator;
    }

    @Override
    public void displayInfo() {
        System.out.println("Creator: " + creator + "; Type of Paint: " + typeOfPaint + "; Painting Size: "
                + paintingSize);
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "typeOfPaint='" + typeOfPaint + '\'' +
                ", paintingSize=" + paintingSize +
                ", creator='" + creator + '\'' +
                '}';
    }
}