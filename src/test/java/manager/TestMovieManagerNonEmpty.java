package manager;

import domain.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTestNonEmpty {

    @Test
    public void shouldRemoveIfExists() {
        MovieManager manager = new MovieManager();
        int idToRemove = 1;
        Movie first = new Movie(1, "1111", "Forest Gamp", "drama", false);
        Movie second = new Movie(2, "2222", "TBV", "comedy", false);
        Movie third = new Movie(3, "3333", "Aquaman", "action", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveIfNotExists() {
        MovieManager manager = new MovieManager();
        int idToRemove = 4;
        Movie first = new Movie(1, "1111", "Forest Gamp", "drama", false);
        Movie second = new Movie(2, "2222", "TBV", "comedy", false);
        Movie third = new Movie(3, "3333", "Aquaman", "action", true);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

}