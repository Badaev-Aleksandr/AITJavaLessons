package lesson25;

public enum Day {
    MONDAY("Monday are bad day"),
    TUESDAY("Tuesday are bad day"),
    WEDNESDAY("Wednesday is a small Friday"),
    THURSDAY("cool"),
    FRIDAY("god day"),
    SATURDAY("Top Day"),
    SUNDAY("super Day");

    private String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
