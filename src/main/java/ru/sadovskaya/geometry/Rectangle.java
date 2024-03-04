package ru.sadovskaya.geometry;

import lombok.Getter;
import ru.sadovskaya.interfaces.Polygonalable;

@Getter
public class Rectangle extends Figure implements Polygonalable {
    private static final String name = "Прямоугольник";
    private Point2D leftDown, rightUp, rightDown;
    private final int leftSide, upSide;

    public Rectangle(Point2D leftUp, int leftSide, int upSide) {
        super(leftUp);
        this.leftSide = leftSide;
        this.upSide = upSide;
        this.rightUp = new Point2D(this.anchor.x + upSide, this.anchor.y);
        this.rightDown = new Point2D(this.rightUp.x, this.rightUp.y - leftSide);
        this.leftDown = new Point2D(this.rightDown.x - upSide, this.rightDown.y);
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
        this.anchor.setX(leftDown.x);
        this.anchor.setY(leftDown.y + leftSide);
        this.rightDown.setX(leftDown.x + upSide);
        this.rightDown.setY(leftDown.y);
        this.rightUp.setX(rightDown.x);
        this.rightUp.setY(anchor.y);
    }

    public void setLeftUp(Point2D leftUp) {
        this.anchor = leftUp;
        this.leftDown.setX(leftUp.x);
        this.leftDown.setY(leftUp.y - leftSide);
        this.rightUp.setX(leftUp.x + upSide);
        this.rightUp.setY(leftUp.y);
        this.rightDown.setX(rightUp.x);
        this.rightDown.setY(leftDown.y);
    }

    public void setRightUp(Point2D rightUp) {
        this.rightUp = rightUp;
        this.anchor.setX(rightUp.x - upSide);
        this.anchor.setY(rightUp.y);
        this.rightDown.setX(rightUp.x);
        this.rightDown.setY(rightUp.y - leftSide);
        this.leftDown.setX(anchor.x);
        this.leftDown.setY(rightDown.y);
    }

    public void setRightDown(Point2D rightDown) {
        this.rightDown = rightDown;
        this.rightUp.setX(rightDown.x);
        this.rightUp.setY(rightDown.y + leftSide);
        this.leftDown.setX(rightDown.x - upSide);
        this.leftDown.setY(rightDown.y);
        this.anchor.setX(leftDown.x);
        this.anchor.setY(rightUp.y);
    }

    @Override
    public String toString() {
        return name + " со сторонами " + leftSide + " и " + upSide +
                ", и с вершинами:\nлевая нижняя " + leftDown + ", левая верхняя "
                + anchor + ", правая верхняя " + rightUp + ", правая нижняя " + rightDown;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new PolygonalChain(leftDown, anchor, rightUp, rightDown);
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        switch (coordinate) {
            case X -> this.setLeftUp(new Point2D(this.anchor.x += shift, this.anchor.y));
            case Y -> this.setLeftUp(new Point2D(this.anchor.x, this.anchor.y += shift));
        }
    }
}

