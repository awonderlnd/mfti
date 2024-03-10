package ru.sadovskaya.trafficlight;

public enum Colors implements Color {
    RED,
    YELLOW,
    GREEN;

    private Colors next;

    static {
        RED.next = YELLOW;
        YELLOW.next = GREEN;
        GREEN.next = RED;
    }

    @Override
    public Color next() {
        return null;
    }
}
