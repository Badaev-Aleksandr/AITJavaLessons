package homework42;

import java.io.Serializable;

public class TourRoute implements Serializable {
    private static final long serialVersionUID = 1L;
    private String routeName; //название маршрута
    private String country;//страна
    private String city;//город
    private int durationDays;//продолжительность тура в днях
    private double cost;// стоимость тура

    public TourRoute(String routeName, String country, String city, int durationDays, double cost) {
        this.routeName = routeName;
        this.country = country;
        this.city = city;
        this.durationDays = durationDays;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "TourRoute{" +
                "routeName='" + routeName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", durationDays=" + durationDays +
                ", cost=" + cost +
                '}';
    }
}
