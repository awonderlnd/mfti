package ru.sadovskaya.geometry;

import lombok.Getter;
import ru.sadovskaya.interfaces.Polygonalable;

@Getter
public class Square extends Rectangle implements Polygonalable {
    private static final String name = "Квадрат";
    private Point2D leftDown, leftUp, rightUp, rightDown;
    private int side;

    public Square(Point2D leftUp, int side) {
        super(leftUp, side, side);
        this.leftUp = leftUp;
        setSide(side);
        this.rightUp = new Point2D(this.leftUp.x + side, this.leftUp.y);
        this.rightDown = new Point2D(this.rightUp.x, this.rightUp.y - side);
        this.leftDown = new Point2D(this.rightDown.x - side, this.rightDown.y);
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона не может быть меньше или равна 0");
        }
        this.side = side;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new ClosedPolyline(leftUp, rightUp, rightDown, leftDown);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLeftDown(Point2D leftDown) {
        this.leftDown = leftDown;
        this.leftUp.setX(leftDown.x);
        this.leftUp.setY(leftDown.y + side);
        this.rightUp.setX(leftUp.x + side);
        this.rightUp.setY(leftUp.y);
        this.rightDown.setX(leftDown.x + side);
        this.rightDown.setY(leftDown.y);
    }

    @Override
    public void setLeftUp(Point2D leftUp) {
        this.leftUp = leftUp;
        this.leftDown.setX(leftUp.x);
        this.leftDown.setY(leftUp.y - side);
        this.rightUp.setX(leftUp.x + side);
        this.rightUp.setY(leftUp.y);
        this.rightDown.setX(leftDown.x + side);
        this.rightDown.setY(leftDown.y);
    }

    @Override
    public void setRightUp(Point2D rightUp) {
        this.rightUp = rightUp;
        this.leftUp.setX(rightUp.x - side);
        this.leftUp.setY(rightUp.y);
        this.leftDown.setX(leftUp.x);
        this.leftDown.setY(leftUp.y - side);
        this.rightDown.setX(leftDown.x + side);
        this.rightDown.setY(leftDown.y);
    }

    @Override
    public void setRightDown(Point2D rightDown) {
        this.rightDown = rightDown;
        this.leftDown.setX(rightDown.x - side);
        this.leftDown.setY(rightDown.y);
        this.leftUp.setX(leftDown.x);
        this.leftUp.setY(leftDown.y + side);
        this.rightUp.setX(leftUp.x + side);
        this.rightUp.setY(leftUp.y);
    }


    @Override
    public String toString() {
        return name + " со стороной " + side + " и c вершинами:\nлевая нижняя " + getLeftDown()
                + ", левая верхняя " + leftUp + ", правая верхняя " + getRightUp()
                + ", правая нижняя " + getRightDown();
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        switch (coordinate) {
            case X -> this.setLeftUp(new Point2D(this.leftUp.x += shift, this.leftUp.y));
            case Y -> this.setLeftUp(new Point2D(this.leftUp.x, this.leftUp.y += shift));
        }
    }
}
