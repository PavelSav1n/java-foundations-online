package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Boy implements Comparable<Boy> {
    private final String name;
    private double age;
    private double height;


    @Override
    public int compareTo(@NotNull Boy boy) {
        return (int)(height - boy.height);

    }
}
