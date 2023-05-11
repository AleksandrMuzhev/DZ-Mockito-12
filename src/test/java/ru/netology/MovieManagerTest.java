package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;
import ru.netology.domain.PosterMovies;

import java.util.Arrays;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();
    MovieManager manager2 = new MovieManager(7);
    PosterMovies movie1 = new PosterMovies(2, "Бладшот", "Боевик");
    PosterMovies movie2 = new PosterMovies(22, "Вперёд", "Мультфильм");
    PosterMovies movie3 = new PosterMovies(30, "Отель «Белград»", "Комедия");
    PosterMovies movie4 = new PosterMovies(5, "Джентельмены", "Боевик");
    PosterMovies movie5 = new PosterMovies(65, "Человек-невидимка", "Ужасы");
    PosterMovies movie6 = new PosterMovies(45, "Тролли. Мировой тур", "Мультфильм");
    PosterMovies movie7 = new PosterMovies(71, "Номер один", "Комедия");

    @BeforeEach
    public void setup() {
        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
    }

    @BeforeEach
    public void setup2() {
        manager2.save(movie1);
        manager2.save(movie2);
        manager2.save(movie3);
        manager2.save(movie4);
        manager2.save(movie5);
        manager2.save(movie6);
        manager2.save(movie7);
    }

    @Test
    public void testAddMovies() {
        PosterMovies movie8 = new PosterMovies(58, "Король Артур", "Боевик");
        manager.save(movie8);

        PosterMovies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8};
        PosterMovies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllMovies() {
        PosterMovies[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        PosterMovies[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllMovies() {
        PosterMovies[] expected = {movie5, movie4, movie3, movie2, movie1};
        PosterMovies[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllMoviesChangeLimit() {
        PosterMovies[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        PosterMovies[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSetGenre() {
        PosterMovies genre = new PosterMovies(43, "Пятница 13", "Комедия");
        genre.setGenre("Ужасы");
        genre.setMovieId(23);
        genre.setMovieName("Фреди против Джейсона");

        Assertions.assertEquals("Ужасы", genre.getGenre());
        Assertions.assertEquals(23, genre.getMovieId());
        Assertions.assertEquals("Фреди против Джейсона", genre.getMovieName());
    }
}
