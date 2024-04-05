package lesson23;

import java.util.HashSet;

public class TestMovieCatalog {
    public static void main(String[] args) {
        MovieCatalog movieCatalog =  new MovieCatalog();

        movieCatalog.addMovie(new Movie("Терминатор","Боевик, Фантастика",2001));
        movieCatalog.addMovie(new Movie("Терминатор","Боевик, Фантастика",2001));
        movieCatalog.addMovie(new Movie("Хоббит","Фентези",2020));
        movieCatalog.addMovie(new Movie("Дракула","Фентези",2000));

        HashSet<Movie> resultFilterByGenre =  movieCatalog.filterMoviesByGenreSmall("Фентези");
        System.out.println("-------");
        resultFilterByGenre.forEach(System.out::println);
        System.out.println("-------");

        movieCatalog.printFilmInfo();
        movieCatalog.deleteMovie(new Movie("Дракула","Фентези",2000));
        movieCatalog.printFilmInfo();
    }

}
