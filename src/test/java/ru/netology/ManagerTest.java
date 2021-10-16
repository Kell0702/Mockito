package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.ListFilms;
import ru.netology.repository.CartRepository;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class ManagerTest {
    private Mockito Mocito;
    private CartRepository repository = Mocito.mock(CartRepository.class);
    private Manager manager = new Manager(repository);
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

    @Test
    public void shouldManager() {
        ListFilms[] returned = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        doReturn(returned).when(repository).findAll();
        ListFilms[] list = new ListFilms[]{film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        ListFilms[] expected = list;
        ListFilms[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }

    @Test
    public void shouldRemuveById() {

        ListFilms[] returned = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        ListFilms[] list = new ListFilms[]{film10, film9, film8, film7, film6, film4, film3, film2, film1};
        doReturn(returned).when(repository).findAll();
        manager.removeById(14);
//        manager.removeById(16);

        ListFilms[] expected = list;
        ListFilms[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }
}

