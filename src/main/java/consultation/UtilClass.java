package consultation;

public class UtilClass {
    /*
    Напишите метод `reverseString` в классе `UtilClass`,
    который принимает строку и возвращает её в обратном порядке.
    Напишите unit тест для проверки работы этого метода.
     */
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    /*
Напишите метод `isEven` в классе `UtilClass`,
который принимает целое число и возвращает `true`,
если число чётное, и `false`, если нечетное. Напишите unit тест для проверки работы этого метода.
 */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    /*
Напишите метод `findMax` в классе `UtilClass`,
 который принимает массив целых чисел и возвращает максимальное
 число из массива. Напишите unit тест для проверки работы этого метода.
 */
    public int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static class JavaFor {
    }

    public static class Changetypes {
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
}
