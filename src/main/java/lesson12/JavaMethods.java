package lesson12;

public class JavaMethods {
    public static void main(String[] args) {
        printGreeting();
        printGreetingStudent("Anna");
        printGreetingStudent("Anna ", 42.2);
        boolean checkResult = checkStudent("anna");
        System.out.println(checkResult);
       // checkGroupNumber(234);
        int checkNumber = getFactorial(5);
        System.out.println(checkNumber);
    }

    public static void printGreeting() {
        System.out.println("Hallo Berlin!!!");
    }

    public static void printGreetingStudent(String studentName) {
        System.out.println("Hallo " + studentName);
    }

    public static void printGreetingStudent(String studentName, double groupNumber) {
        System.out.println("Hallo " + studentName + "your group " + groupNumber);
    }

    public static boolean checkStudent(String studentName) {
        if (studentName.equalsIgnoreCase("Anna")) {
            return true;
        } else {
            return false;
        }

        //return studentName.equalsIgnoreCase("Anna");
    }
    public static void checkGroupNumber (double groupNumber){
        System.out.println(groupNumber);

    }
    // расчет факториала
    public  static  int getFactorial (int number){
        if (number == 1){
            return 1;
        }else {
            return number * getFactorial((number - 1));
        }
    }
}
