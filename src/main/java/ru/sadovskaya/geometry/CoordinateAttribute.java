package ru.sadovskaya.geometry;

public class CoordinateAttribute extends Attribute {

    CoordinateAttribute(int x) {
        this(x, 0, 0);
    } //Почему нельзя создать несколько таких на разные коррдинаты?

    CoordinateAttribute(int x, int y) {
        this(x, y, 0);
    }

    CoordinateAttribute(int x, int y, int z) {
        super("Координаты", new Point3D(x, y, z));
    }

    @Override
    public Object getValue() {
        return (Point3D) super.getValue();
    }

}
