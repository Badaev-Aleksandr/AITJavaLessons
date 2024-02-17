package homework05;

public class HomeWork05 {
    public static void main(String[] args) {
        // Task01
        int a = 137;
        int b = 137;
        String variant01 = "\"a больше b\" ";
        String variant02 = "\"a меньше b\" ";
        String variant03 = "\"a равно b\" ";
        if (a > b) {
            System.out.println(variant01);
        }
        if (a < b) {
            System.out.println(variant02);
        }
        if (a == b) {

            System.out.println(variant03);
        }

        //------------------------------------------------------

        //Task02
        int x = 10;
        int y = 11;
        int z = 1;
        boolean result;

        if ((x > y && y > z) || (x < y && y < z)) {

            result = true;
        } else {
            result = false;
        }
        {
            System.out.println(result);
        }

        //----------------------------------------------------------

        //Task03

        int age = 76;
        boolean driverLicense;

        if (age >= 16 && age <= 75) {
            System.out.println(true);
            driverLicense = true;
        } else {
            System.out.println(false);
            driverLicense = false;
        }
        //-----------------------------------------------------------

        //Task04

        int score = 100;
        if (score >= 90) {
            System.out.println("Отлично");
        }
        if (score >= 70 && score <= 89) {
            System.out.println("Хорошо");
        }
        if (score >= 50 && score <= 69) {
            System.out.println("Удовлетворительно");
        }
        if (score < 50) {
            System.out.println("Неудовлетворительно");
        }


    }
}