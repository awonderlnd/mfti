package ru.sadovskaya.geometry;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Point3D extends Point2D {
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + getX() + ";" + getY() + ";" + getZ() + "}";
    }
}
