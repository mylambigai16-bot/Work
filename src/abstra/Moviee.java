package abstra;

import java.util.*;

interface SearchbyGen {
    void searchGen(String gen);
}

interface SearchbyTitle {
    void searchTitle(String title);
}

class Catalogue implements SearchByGen, SearchByTitle {

    private static Date lastUpdate;
    private static List<Moviee> movieList = new ArrayList<>();

    public void searchTitle(String title) {

        for (Moviee movie : movieList) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.getMovieDetail();
            }
        }
    }

    public void searchGen(String gen) {

        for (Moviee movie : movieList) {
            if (movie.getGen().equalsIgnoreCase(gen)) {
                movie.getMovieDetail();
            }
        }
    }

    public void addMovie(Moviee movie) {
        movieList.add(movie);
        lastUpdate = new Date();
    }
}

class Moviee {

    private String title;
    private String description;
    private int rating;
    private String language;
    private Date date;
    private String country;
    private String gen;

    public Moviee(String title, String description, int rating,
                  String language, Date date, String country, String gen) {

        this.title = title;
        this.description = description;
        this.rating = rating;
        this.language = language;
        this.date = date;
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
        System.out.println("Description: " + description);
        System.out.println("Rating: " + rating);
        System.out.println("Language: " + language);
        System.out.println("Release Date: " + date);
        System.out.println("Country: " + country);
        System.out.println("Genre: " + gen);
        System.out.println("----------------------");
    }
}
