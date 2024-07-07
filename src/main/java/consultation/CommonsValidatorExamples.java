package consultation;

import org.apache.commons.validator.routines.DateValidator;
import org.apache.commons.validator.routines.DoubleValidator;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.IBANValidator;
import org.apache.commons.validator.routines.ISBNValidator;
import org.apache.commons.validator.routines.IntegerValidator;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.UrlValidator;

public class CommonsValidatorExamples {
    public static void main(String[] args) {
        String emailValid = "test@test.com";
        String emailNoValid = "test.test.com";

        EmailValidator emailValidator = EmailValidator.getInstance();
        System.out.println("Email " + emailValidator.isValid(emailValid));
        System.out.println("Email " + emailValidator.isValid(emailNoValid));

        IntegerValidator integerValidator = IntegerValidator.getInstance();
        int number = 50;
        System.out.println(integerValidator.isInRange(number, 100, 500));
        System.out.println(integerValidator.isInRange(150, 100, 300));

        String numberString = "200k";
        System.out.println(integerValidator.validate(numberString));

        DateValidator dateValidator = DateValidator.getInstance();
        String dateStr = "2022-02-02";                            //нужно настроить
        System.out.println("Date " + dateValidator.validate(dateStr, "yyyy-MM-dd"));

        UrlValidator urlValidator = UrlValidator.getInstance();
        System.out.println("Link " + urlValidator.isValid("http://www.google.ru"));

        IBANValidator ibanValidator = IBANValidator.getInstance();
        System.out.println("IBAN " + ibanValidator.isValid("DE83793503010021442397"));

        DateValidator dateValidator2 = DateValidator.getInstance();
        String time = "20:30";
        System.out.println("Time " + dateValidator2.isValid(time, "HH:mm"));

        DoubleValidator doubleValidator = DoubleValidator.getInstance();
        String doubleStr = "30,34";
        System.out.println("Double value " + doubleValidator.isValid(doubleStr));

        RegexValidator regexValidator = new RegexValidator("^[A-Z]{2}-\\d{4}-[A-Z]{2}$");
        String platel = "AB-1234-CD";
        System.out.println("Проверка Номера машины по шаблону" + regexValidator.isValid(platel));

        RegexValidator passwordValidator = new RegexValidator("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        String password = "Example$123";
        System.out.println("Проверка пароля на соответствие требований" + passwordValidator.isValid(password));

        //Международный стандартный номер книги
        ISBNValidator isbnValidator = ISBNValidator.getInstance();
        String isbn = "9783161484100";
        System.out.println(isbnValidator.isValid(isbn));


    }
}
