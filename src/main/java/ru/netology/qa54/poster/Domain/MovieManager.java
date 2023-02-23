package ru.netology.qa54.poster.Domain;

public class MovieManager {

    private String[] movies = new String[0];
    private int limit;
    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {

        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAllMovie() {
        return movies;

    }

    public String[] findLastMovie() {
        int Length;

        if (movies.length < limit) {
            Length = movies.length;
        } else {
            Length = limit;
        }

        String[] tmp = new String[Length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }
}