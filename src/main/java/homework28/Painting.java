package homework28;

public class Painting implements Artwork {
    private String typeOfPaint;
    private String paintingSize;
    private String creator;
    private String artType;



    public String getTypeOfPaint() {
        return typeOfPaint;
    }

    public String getPaintingSize() {
        return paintingSize;
    }

    public Painting(String artType, String typeOfPaint, String paintingSize, String creator) {
        this.typeOfPaint = typeOfPaint;
        this.paintingSize = paintingSize;
        this.artType = artType;
        this.creator = creator;
    }

    @Override
    public void displayInfo() {
        System.out.println("Art Type: " + artType + " Creator: " + creator + "; Type of Paint: " + typeOfPaint + "; Painting Size: "
                + paintingSize);
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
        return "Painting{" +
                "typeOfPaint='" + typeOfPaint + '\'' +
                ", paintingSize='" + paintingSize + '\'' +
                ", creator='" + creator + '\'' +
                ", artType='" + artType + '\'' +
                '}';
    }
}