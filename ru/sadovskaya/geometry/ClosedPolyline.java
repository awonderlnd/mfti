package ru.sadovskaya.geometry;

public class ClosedPolyline extends PolygonalChain {
    ClosedPolyline(Point2D... pointList) {
        super(pointList);
    }

    @Override
    public double getLength() {
        return super.getLength() +
                new Line(pointList.get(0), pointList.get(pointList.size() - 1)).getLength();
    }

}
