package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.repository.CartRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CartRepositoryTest {

    private CartRepository repository = new CartRepository();
    private ListFilms films = new ListFilms();
    private ListFilms film1 = new ListFilms(10, "Бладшот", 1);
    private ListFilms film2 = new ListFilms(11, "Вперёд", 2);
    private ListFilms film3 = new ListFilms(12, "Отель Белград", 3);
    private ListFilms film4 = new ListFilms(13, "Джентельмены", 4);
    private ListFilms film5 = new ListFilms(14, "Человек-Неведимка", 5);
    private ListFilms film6 = new ListFilms(15, "Тролли", 6);
    private ListFilms film7 = new ListFilms(16, "Номер один", 7);
    private ListFilms film8 = new ListFilms(17, "Мулан", 8);
    private ListFilms film9 = new ListFilms(18, "Драйв", 9);
    private ListFilms film10 = new ListFilms(19, "Ветер крепчает", 10);


//    @Test
//    public void shouldSaveOneItem() {
//        repository.save(films);
//
//        ListFilms[] expected = new ListFilms[]{films};
//        ListFilms[] actual = repository.findAll();
//        assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    public void shouldRemoveById() {
//        repository.save(films);
//        repository.removeById(15);
//
//        ListFilms[] expected = new ListFilms[]{};
//        ListFilms[] actual = repository.findAll();
//        assertArrayEquals(expected, actual);
//
//    }
}
