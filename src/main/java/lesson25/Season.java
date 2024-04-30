package lesson25;

/*
1. Создайте enum `Season`, который включает четыре времени года: `SPRING`, `SUMMER`, `AUTUMN`, `WINTER`.
Напишите метод в этом enum, который возвращает рекомендуемую активность для каждого сезона (например, лыжи зимой).

2. Используя созданный enum `Season`, напишите метод, который принимает значение `Season`
и выводит сообщение о том, как одеваться в этот сезон, используя конструкцию `switch`.

 */
public enum Season {
    SPRING("give flowers"), SUMMER("swim in the sea"), AUTUMN("dress warmly"), WINTER("ski");
    private String description;


    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
