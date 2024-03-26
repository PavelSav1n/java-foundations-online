package ru.itsjava.experiments.question2;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableList {
    private final List<String> list;

    public ImmutableList(List<String> listValue) {
//        this.list = listValue; // В этом случае будет передана ссылка и при изменении данных в куче в первой ссылке, в новой данные тоже будут изменены
        list = new ArrayList<>();
        list.addAll(listValue);
    }


    public List<String> getList(){
        List<String> listValue = new ArrayList<>();
        listValue.addAll(list);
        return listValue;
//        return list; // В этом случае можно присвоить immutableList.getList какой-нибудь переменной и добавить .add элемент. Данные в куче при этом изменятся.
    }
}
