package ru.netology.domain;

public class PosterMovies {
    private int movieId;
    private String movieName; //название фильма
    private String genre; //жанр

    public PosterMovies(int movieId, String movieName, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
