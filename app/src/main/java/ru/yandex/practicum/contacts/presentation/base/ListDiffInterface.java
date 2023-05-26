package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactTypeUi;
import ru.yandex.practicum.contacts.presentation.sort.SortTypeUI;

public interface ListDiffInterface <T> {

    boolean theSameAs(T obj);


    boolean equals(Object abs);
}
