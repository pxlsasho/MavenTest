package oop.figures;

public class Rectangle extends AFigure {

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}

