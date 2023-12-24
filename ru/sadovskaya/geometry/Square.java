package ru.sadovskaya.geometry;

import lombok.Getter;
import ru.sadovskaya.main.Polygonalable;

@Getter
public class Square extends Rectangle implements Polygonalable {
    private static final String name = "Квадрат";
    private Point2D leftDown, leftUp, rightUp, rightDown;
    private int side;

    Square(Point2D leftUp, int side) {
        super(leftUp, side, side);
        this.leftUp = leftUp;
        setSide(side);
        this.rightUp = new Point2D(this.leftUp.getX() + side, this.leftUp.getY());
        this.rightDown = new Point2D(this.rightUp.getX(), this.rightUp.getY() - side);
        this.leftDown = new Point2D(this.rightDown.getX() - side, this.rightDown.getY());
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
        this.leftUp.setX(leftDown.getX());
        this.leftUp.setY(leftDown.getY() + side);
        this.rightUp.setX(leftUp.getX() + side);
        this.rightUp.setY(leftUp.getY());
        this.rightDown.setX(leftDown.getX() + side);
        this.rightDown.setY(leftDown.getY());
    }

    @Override
    public void setLeftUp(Point2D leftUp) {
        this.leftUp = leftUp;
        this.leftDown.setX(leftUp.getX());
        this.leftDown.setY(leftUp.getY() - side);
        this.rightUp.setX(leftUp.getX() + side);
        this.rightUp.setY(leftUp.getY());
        this.rightDown.setX(leftDown.getX() + side);
        this.rightDown.setY(leftDown.getY());
    }

    @Override
    public void setRightUp(Point2D rightUp) {
        this.rightUp = rightUp;
        this.leftUp.setX(rightUp.getX() - side);
        this.leftUp.setY(rightUp.getY());
        this.leftDown.setX(leftUp.getX());
        this.leftDown.setY(leftUp.getY() - side);
        this.rightDown.setX(leftDown.getX() + side);
        this.rightDown.setY(leftDown.getY());
    }

    @Override
    public void setRightDown(Point2D rightDown) {
        this.rightDown = rightDown;
        this.leftDown.setX(rightDown.getX() - side);
        this.leftDown.setY(rightDown.getY());
        this.leftUp.setX(leftDown.getX());
        this.leftUp.setY(leftDown.getY() + side);
        this.rightUp.setX(leftUp.getX() + side);
        this.rightUp.setY(leftUp.getY());
    }


    @Override
    public String toString() {
        return name + " со стороной " + side + " и c вершинами:\nлевая нижняя " + getLeftDown()
                + ", левая верхняя " + leftUp + ", правая верхняя " + getRightUp()
                + ", правая нижняя " + getRightDown();
    }
}
