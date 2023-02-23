package ru.netology.qa54.poster.Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MovieManagerTest {

    @Test

    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAllMovie();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldLastMovie() {
        MovieManager manager = new MovieManager(4);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");

        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLastMovie();

        Assertions.assertArrayEquals(expected, actual);

    }
}
