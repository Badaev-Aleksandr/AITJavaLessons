package lesson25;
/*
1. Создайте enum `Season`, который включает четыре времени года: `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`.
Напишите метод в этом enum, который возвращает рекомендуемую активность для каждого сезона (например, лыжи зимой).

2. Используя созданный enum `Season`, напишите метод, который принимает значение `Season`
и выводит сообщение о том, как одеваться в этот сезон, используя конструкцию `switch`.

 */
public class TestSeason {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.getDescription());

        System.out.println(Season.SUMMER.name() + " " + Season.SUMMER.getDescription());
        clothingSeason(Season.AUTUMN);

    }
    public static void clothingSeason(Season clothing) {
        switch (clothing) {
            case AUTUMN:
                System.out.println(clothing.name() + " It's time to dress warmer");
                break;
            case SPRING:
                System.out.println(clothing.name() + " The sun is shining warmer. It's time to take off your fur coat");
                break;
            case SUMMER:
                System.out.println(clothing.name() + " Hot. Light clothing is suitable");
                break;
            case WINTER:
                System.out.println(clothing.name() + " Very cold. Scarf hat and felt boots");
                break;
        }
    }
}
