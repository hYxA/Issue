package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.Collection;

public class IssueRepository {
    private Collection<Issue> items = new ArrayList<>();

    public Collection<Issue> findAll() {
        return items;
    }

    public Issue getById(int id) {
        for (Issue item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        System.out.printf("Такого элемента не существует.");
        return null;
    }

    public void save(Issue item) {
        items.add(item);
    }

    public void removeById(int id) {
        items.removeIf(item -> item.getId() == id);
    }

    public void remove(Issue item) {
        items.remove(item);
    }
}
