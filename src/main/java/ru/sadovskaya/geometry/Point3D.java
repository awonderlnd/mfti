package ru.sadovskaya.geometry;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Point3D extends Point2D {
    public int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        super.shift(coordinate, shift);
        if (coordinate == Coordinate.Z) {
            this.z += shift;
        }
    }

    @Override
    public String toString() {
        return "Точка {" + getX() + ";" + getY() + ";" + getZ() + "}";
    }
}
