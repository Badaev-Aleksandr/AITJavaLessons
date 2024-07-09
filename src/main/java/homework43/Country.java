package homework43;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Objects;

public class Country {
    private String country;
    private String capital;
    private int population;
    private int area;

    public Country(String country, String capital, int population, int area) {
        this.country = country;
        this.capital = capital;
        this.population = population;
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(country, country1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(country);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", square=" + area +
                '}';
    }
}
