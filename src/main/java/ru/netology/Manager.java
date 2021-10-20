package ru.netology;

import ru.netology.repository.CartRepository;

import java.util.Objects;

public class Manager {
    private CartRepository repository;

    public CartRepository getRepository() {
        return repository;
    }

    public void setRepository(CartRepository repository) {
        this.repository = repository;
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
        int listFilms = items.length;
        if (items.length < 10) {
        } else {
            listFilms = 10;
        }
        ListFilms[] result = new ListFilms[listFilms];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Manager manager = (Manager) o;
//        return Objects.equals(repository, manager.repository);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(repository);
//    }
}