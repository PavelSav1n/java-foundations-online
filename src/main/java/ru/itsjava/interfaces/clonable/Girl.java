package ru.itsjava.interfaces.clonable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Girl implements Cloneable {
    private final String name;
    private double height;

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
