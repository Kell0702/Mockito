package ru.netology;

import ru.netology.repository.CartRepository;

import java.util.Objects;

public class Manager {
    private static Object ListFilms;
    private CartRepository repository;
    private int length;
    private int listLength;

    public Manager(CartRepository repository, int length, int listLength) {
        this.repository = repository;
        this.length = length;
        this.listLength = listLength;
    }

    public static void Manager(String[] args) {
        Manager repository = new Manager((CartRepository) ListFilms, 10, 8);
    }

    public void setRepository(CartRepository repository) {
        this.repository = repository;
    }

    public CartRepository getRepository() {
        return repository;
    }

    public void add(ListFilms[] item) {
        repository.save(item);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public ListFilms[] getAllNoLimit() {
        ListFilms[] items = repository.findAll();
        ListFilms[] result = new ListFilms[listLength];
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public ListFilms[] getAll() {
        ListFilms[] items = repository.findAll();
        ListFilms[] result = new ListFilms[length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}