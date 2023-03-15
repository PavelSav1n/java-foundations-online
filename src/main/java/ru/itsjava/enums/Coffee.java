package ru.itsjava.enums;

public enum Coffee {
    ESPRESSO("крепкий"), AMERICANO("с водой"),
    CAPPUCCINO("с молоком"), LATTE("молочный");

    private final String characteristic;

    Coffee(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String toString() {
        return "Coffee{" + this.name() +
                " (characteristic='" + characteristic + ")}";
    }
}
