package ru.netology;

import ru.netology.repository.CartRepository;


public class Manager {
    private CartRepository repository;
    private int listLength;

    Manager() {
        super();
    }

    Manager(CartRepository repository, int listLength) {
        this.repository = repository;
        this.listLength = listLength;
    }

    public int getset() {
        ListFilms[] items = repository.findAll();
        ListFilms[] result = new ListFilms[listLength];
        ListFilms[] max = new ListFilms[10];
        listLength = items.length;
        if (listLength < max.length) {
            result = items;
        }
        if (listLength > max.length) {
            result = max;
        }
        return result.length;
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

    public ListFilms[] resultLengthFilm() {
        ListFilms[] items = repository.findAll();
        ListFilms[] result = new ListFilms[getset()];
//        ListFilms[] max = new ListFilms[10];

//        this.listLength = getset();
//        if (this.listLength < max.length) {
//            result = items;
//        }
//        if (this.listLength > max.length) {
//            result = max;
//        }
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public ListFilms[] getAllNoLimit() {
        ListFilms[] items = repository.findAll();
        ListFilms[] result = new ListFilms[getset()];
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public ListFilms[] getAll() {
        ListFilms[] items = repository.findAll();
        ListFilms[] result = new ListFilms[getset()];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}