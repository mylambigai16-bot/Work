package abstra;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

interface SearchByGen {
    void searchGen(String gen);
}

interface SearchByTitle {
    void searchTitle(String title);
}

/* Movie class (public) */
public class Movie {

    private String title;
    private String genre;
    private int rating;
    private String language;
    private Date releaseDate;
    private String country;
    private String gen;

    public Movie(String title, String genre, int rating, String language,
                 Date releaseDate, String country, String gen) {

        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.gen = gen;
    }

    public String getTitle() {
        return title;
    }

    public String getGen() {
        return gen;
    }

    public void getMovieDetail() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Country: " + country);
        System.out.println("Gen: " + gen);
        System.out.println("----------------------");
    }
}

/* Catalog class for searching */
class Catalog implements SearchByGen, SearchByTitle {

    private static List<Movie> movieList = new ArrayList<>();

    public void searchTitle(String title) {
        for (Movie movie : movieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.getMovieDetail();
            }
        }
    }

    public void searchGen(String gen) {
        for (Movie movie : movieList) {
            if (movie.getGen().equalsIgnoreCase(gen)) {
                movie.getMovieDetail();
            }
        }
    }

    public static void main(String[] args) {

        Catalog c = new Catalog();

        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = cal.getTime();

        Movie m1 = new Movie("AAA", "Drama", 3, "English", date, "France", "Action");
        movieList.add(m1);

        System.out.println("Search by Title:");
        c.searchTitle("AAA");

        System.out.println("Search by Genre:");
        c.searchGen("Action");
    }
}
