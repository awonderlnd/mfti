package ru.sadovskaya.geometry;

import lombok.Getter;
import ru.sadovskaya.main.Polygonalable;

@Getter
public class Rectangle extends Figure implements Polygonalable {
    private static final String name = "Прямоугольник";
    private Point2D leftDown, leftUp, rightUp, rightDown;
    private int leftSide, upSide;

    Rectangle(Point2D leftUp, int leftSide, int upSide) {
        super(leftUp);
        this.leftSide = leftSide;
        this.upSide = upSide;
        this.rightUp = new Point2D(this.leftUp.getX() + upSide, this.leftUp.getY());
        this.rightDown = new Point2D(this.rightUp.getX(), this.rightUp.getY() - leftSide);
        this.leftDown = new Point2D(this.rightDown.getX() - upSide, this.rightDown.getY());
    }

    @Override
    public double getArea() {
        return leftSide * upSide;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setLeftDown(Point2D leftDown) {
        this.leftDown = leftDown;
        this.leftUp.setX(leftDown.getX());
        this.rightDown.setY(leftDown.getY());
    }

    public void setLeftUp(Point2D leftUp) {
        this.leftUp = leftUp;
        this.leftDown.setX(leftUp.getX());
        this.rightUp.setY(leftUp.getY());
    }

    public void setRightUp(Point2D rightUp) {
        this.rightUp = rightUp;
        this.rightDown.setX(rightUp.getX());
        this.leftUp.setY(rightUp.getY());
    }

    public void setRightDown(Point2D rightDown) {
        this.rightDown = rightDown;
        this.rightUp.setX(rightDown.getX());
        this.leftDown.setY(rightDown.getY());
    }

    @Override
    public String toString() {
        return name + " со сторонами " + leftSide + " и " + upSide + ", и с вершинами:\nлевая нижняя " + leftDown + ", левая верхняя " + leftUp + ", правая верхняя " + rightUp + ", правая нижняя " + rightDown;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new PolygonalChain(leftDown, leftUp, rightUp, rightDown);
    }
}

