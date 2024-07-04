package lesson46;

public class Box <T>{
    private T item; // T -> тип параметра

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
