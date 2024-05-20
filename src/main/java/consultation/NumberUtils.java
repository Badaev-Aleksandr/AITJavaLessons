package consultation;

public class NumberUtils {
    /*
Напишите метод `isEven` в классе `NumberUtils`,
который принимает целое число и возвращает `true`,
если число чётное, и `false`, если нечетное. Напишите unit тест для проверки работы этого метода.
 */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
