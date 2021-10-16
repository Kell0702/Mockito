package ru.netology.repository;

import ru.netology.ListFilms;

public class CartRepository {
    private ListFilms[] items = new ListFilms[0];

    public void save(ListFilms item) {
        int length = items.length + 1;
        ListFilms[] tmp = new ListFilms[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public ListFilms[] findAll() {
        return items;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        ListFilms[] tmp = new ListFilms[length];
        int index = 0;
        for (ListFilms item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }
}

