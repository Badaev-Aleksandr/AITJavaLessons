package lesson46;

public class BoxExamples {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(56525);
        Integer item = integerBox.getItem();
        System.out.println(item);

        Box<String> boxString = new Box<>();
        boxString.setItem("Hallo my life");
        String s = boxString.getItem();
        System.out.println(s);
    }
}
