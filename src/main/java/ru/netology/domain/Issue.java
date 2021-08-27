package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Issue {
    private boolean isClosed;
    private int id;
    private String author;
    private String label;
    private String assignee;
    private String Priority;
}
