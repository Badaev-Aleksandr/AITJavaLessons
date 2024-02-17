package lesson05;

public class Operators {


    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = 10;

        // Оператор равенства ==
        boolean isEqual = (numberOne == numberTwo);
        System.out.println(isEqual);

        int numberThree = 50;
        int numberFour = 60;

        // Оператор неравенства !=
        System.out.println(numberThree != numberFour);

        //Оператор больше >
        System.out.println(numberThree > numberFour);

        //Оператор меньше <
        System.out.println(numberThree < numberFour);

        //Оператор больше или равно >=
        System.out.println(numberOne >= numberTwo);

        //Оператор меньше или равно <=
        System.out.println(numberOne <= numberTwo);

        // Метод для сравнения переменных (.equals)
        String nameOne = "Mustermann";
        String nameTwo = "Musterman";
        System.out.println(nameOne.equals(nameTwo));

        /*
        AND = &&
        false && false --> false
        false && true --> false
        true && false --> false
        true && true --> true
          */
        /*
        OR = ||
        false && false --> false
        false && true --> true
        true && false --> true
        true && true --> true
         */

        int age = 20;
        int salary = 10000; //Зарпалата
        boolean hasPass = true;
        //Bank1
        boolean hasCredit;
        if (age >= 21 && salary > 2000 && hasPass == true) //Условия
        {
            System.out.println("Positiv");
            hasCredit = true;
        }
        else  //Если
        {
            System.out.println("Negativ");
            hasCredit = false;
        }

        System.out.println("Bank VTB:" + hasCredit);


        // Bank2
        if (age >= 21 || salary > 3000) // (|| ИЛИ )
        {
            hasCredit = true;
        }
        else
        {
            hasCredit = false;
        }
        System.out.println("Bank Alfa:" + hasCredit);

        int numberA = 4;
        int numberB = 20;
        boolean checkResult = true;
        if (numberA > 10 && numberB > 15) //false || true --> true
        {
            checkResult = true;
        }
        if (numberA > 10  || numberB >  15) // false && true --> false
        {
            checkResult = false;
        }
        System.out.println(checkResult);

        //Банковская операция пример

        double accountBalance = 5000.0;
        boolean accountActive = true;
        double amountToWithdraw = 6000.0;
        boolean transactionSuccess = false;

        if (accountActive && accountBalance >= amountToWithdraw)
        {
            accountBalance = accountBalance - amountToWithdraw;
            transactionSuccess = true;
            System.out.println("Transaction: " + transactionSuccess + " Balance: " + accountBalance);
        }
        else
        {
            System.out.println("ERROR!!!" + transactionSuccess);
        }
    }
}
