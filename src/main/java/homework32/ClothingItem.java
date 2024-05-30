package homework32;

public class ClothingItem {
    private String name;
    private String type;
    private ItemSize size;
    private double price;

    public ClothingItem(String name, String type, ItemSize size, double price) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }
    public ClothingItem(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ItemSize getSize() {
        return size;
    }

    public void setSize(ItemSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
