package ru.netology;

import ru.netology.repository.CartRepository;

public class Manager {
    private CartRepository repository;

    public Manager() {
    }

    public Manager(CartRepository repository) {
        this.repository = repository;
    }

    public void add(ListFilms item) {
        repository.save(item);
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

    public ListFilms[] getAll() {
        ListFilms[] items = repository.findAll();
        ListFilms[] result = new ListFilms[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}