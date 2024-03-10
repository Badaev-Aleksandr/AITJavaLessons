package consultation0903;

public class Changetypes {
    public static void main(String[] args) {
        int number = 3000;
        String numberString = String.valueOf(number);

        Integer numberTwo = Integer.valueOf(numberString);
        int numberThree = Integer.parseInt(numberString);

        System.out.println(numberString);
        System.out.println(numberTwo);
        System.out.println(numberThree);
    }
}
