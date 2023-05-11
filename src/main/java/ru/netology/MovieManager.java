package ru.netology;

import ru.netology.domain.PosterMovies;

public class MovieManager {
    private int limit = 5;
    private PosterMovies[] movies = new PosterMovies[0];

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
    }

    public int getLimit() {
        return limit;
    }


    public PosterMovies[] findAll() {
        return movies;
    }

    public void save(PosterMovies movie) {
        PosterMovies[] tmp = new PosterMovies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public PosterMovies[] findLast() {
        int resultLength = 0;
        if (limit == movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = getLimit();
        }
        PosterMovies[] result = new PosterMovies[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = findAll()[resultLength - 1 - i];
        }
        return result;
    }
}
