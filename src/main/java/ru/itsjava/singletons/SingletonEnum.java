package ru.itsjava.singletons;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public enum SingletonEnum {

    INSTANCE("This is enum singleton");

    @Setter
    private String info;

    private SingletonEnum(String info) {
        this.info = info;
    }

    public SingletonEnum getInstance(){
        return INSTANCE;
    }

}
