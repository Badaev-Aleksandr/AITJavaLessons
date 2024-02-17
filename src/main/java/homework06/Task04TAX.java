package homework06;

import java.util.Scanner;

public class Task04TAX {
    /*
    Task04
    Комбинированный налог: Создайте программу
    для расчёта налога, который зависит от категории товара и региона покупателя.
     Налог на электронику 10%, на одежду 5%.
     Если покупатель из региона A, применяется дополнительный налог 2%.
     */
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double electronicsTax = 0.1;
        double dressTax = 0.05;
        double regionATax = 0.02;

        System.out.println("Введите пожалуйста общую сумму на Электроприборы");
        double electronicsPrice = scanner.nextDouble();
        System.out.println("Введите пожалуйста общую сумму на Одежду");
        double dressPrice = scanner.nextDouble();
        System.out.println("Является ли покупатель жителем региона А? введите yes или no");
        String regionA = scanner.next();
        scanner.close();
        if (regionA.equals("yes")) {
            double resultElectronicsTax = electronicsPrice * electronicsTax;
            double resultDressTax = dressPrice * dressTax;
            double sumElectronicsPrise = electronicsPrice + resultElectronicsTax;
            double sumDressPrice = dressPrice + resultDressTax;
            double resultRegionTax = (electronicsPrice + dressPrice) * regionATax;
            double sumPrice = electronicsPrice + dressPrice;
            double resultRegionPrice = resultRegionTax + sumPrice;
            double totalTax = resultRegionTax + resultDressTax + resultElectronicsTax;
            double totalPrice = sumPrice + totalTax;
            System.out.println("Сумма вашей закупки составила " + sumPrice + "$");
            System.out.println("Налог на Электронику 10% = " + resultElectronicsTax + "$");
            System.out.println("Налог на Одежду 5% = " + resultDressTax + "$");
            System.out.println("Налог на то что вы являетесь резидентом региона А 2% = " + resultRegionTax + "$");
            System.out.println("Сумма налогов за покупку = " + totalTax + "$");
            System.out.println("Итоговая сумма к оплате с налогом = " + totalPrice + "$");
        } else if (regionA.equals("no")) {
            double resultElectronicsTax = electronicsPrice * electronicsTax;
            double resultDressTax = dressPrice * dressTax;
            double sumElectronicsPrise = electronicsPrice + resultElectronicsTax;
            double sumDressPrice = dressPrice + resultDressTax;
            double sumPrice = electronicsPrice + dressPrice;
            double totalTax = resultDressTax + resultElectronicsTax;
            double totalPrice = sumPrice + totalTax;
            System.out.println("Сумма вашей закупки составила " + sumPrice + "$");
            System.out.println("Налог на Электронику 10% = " + resultElectronicsTax + "$");
            System.out.println("Налог на Одежду 5% = " + resultDressTax + "$");
            System.out.println("Сумма налогов за покупку = " + totalTax + "$");
            System.out.println("Итоговая сумма к оплате с налогом = " + totalPrice + "$");

        } else {
            System.out.println("ERROR!!! Запустите программу еще раз и введите корректные данные!");
        }
    }
}
